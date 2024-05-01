import greenfoot.*;

public class BlackjackWorld extends World {
    private boolean playerTurn = true;
    private boolean dealerTurn = false;
    private Deck deck;
    private BlackjackHand player;
    private BlackjackHand dealer;
    private NewGameButton newGameButton;
    private Draw draw;
    private YouWin youWin;
    private YouLose youLose;
    private Max max;
    private SurrenderButton surrenderButton;
    private Bet betDisplay; 

    public BlackjackWorld(Bet betDisplay, Max max) { super(1246, 700, 1);
        this.betDisplay = betDisplay; 
        this.max= max;
        

        deck = new Deck(1); 
        player = new BlackjackHand("Jimmy");
        dealer = new BlackjackHand("Tony Allen");
        deck.shuffle();
        deck.deal(new BlackjackHand[]{player}, 1, true);
        deck.deal(new BlackjackHand[]{dealer}, 1, false);
        deck.deal(new BlackjackHand[]{player, dealer}, 1, true);
        draw = new Draw();
        youWin = new YouWin();
        youLose = new YouLose();
        newGameButton = new NewGameButton();
        SurrenderButton surrenderButton = new SurrenderButton();

        
        addObject(deck, 918, 243);
        addObject(player, 550, 575);
        addObject(dealer, 645, 274);
        addObject(new HitButton(), 140, 630);
        addObject(new StandButton(), 1140, 645);
        addObject(new BackButton(), 1162, 43);
        addObject(max, 1092, 116);
        addObject(betDisplay, 1138, 161);
        addObject(surrenderButton, 295, 639);
    }  
    
                
    public void act() {
        if (max.getMax() <= 0) {
            Greenfoot.setWorld(new WOMPWOMP());
        }
        if (playerTurn) {
            
            if (Greenfoot.mouseClicked(null)) {
                Actor clicked = Greenfoot.getMouseInfo().getActor();
                if (clicked instanceof HitButton) {
                    player.add(deck.deal(true));
                    removeObject(surrenderButton);
                    if ((player.getWeight() >= 21) || (player.getWeight() == -1)) { 
                        playerTurn = false;
                        dealerTurn = true;
                    }
                } else if (clicked instanceof StandButton) {
                    playerTurn = false;
                    dealerTurn = true;
                }else if (clicked instanceof SurrenderButton){
                    max.updateMax((int)(-0.5* betDisplay.getAmount()));
                    Greenfoot.setWorld(new BettingScreen(max.getMax()));
                }
                
                
            }
            
        } else if (dealerTurn) {
            dealer.show();
            while (dealer.getWeight() < 17 && dealer.getWeight() != -1) {
                dealer.add(deck.deal(true));
            }
            dealerTurn = false;
           
        } else if (!(dealerTurn && playerTurn)) {
            if (dealer.getWeight() == player.getWeight()) {
                addObject(draw, 115, 142);
            } else if (player.getWeight() > dealer.getWeight()) {
                addObject(youWin, 115, 142);
                
            } else if ((dealer.getWeight() > player.getWeight())) {
                addObject(youLose, 115, 142);
            }
            addObject(newGameButton, 87, 384);
            
            if (Greenfoot.mouseClicked(null)) {
                Actor clicked = Greenfoot.getMouseInfo().getActor();
                if (clicked instanceof NewGameButton) {
                    removeObject(deck);
                    removeObject(player);
                    removeObject(dealer);
                    removeObject(youLose);
                    removeObject(youWin);
                    removeObject(draw);
                    removeObject(newGameButton);
                    if (player.getWeight() > dealer.getWeight()){
                        max.updateMax(betDisplay.getAmount());
                    }else if ((dealer.getWeight() > player.getWeight())) {
                        max.updateMax(-1* betDisplay.getAmount());
                    }
                    Greenfoot.setWorld(new BettingScreen(max.getMax()));
                    deck = new Deck(1); 
                    player = new BlackjackHand("Jimmy");
                    dealer = new BlackjackHand("Tony Allen");
                    playerTurn = true;
                    deck.shuffle();
                    deck.deal(new BlackjackHand[]{player}, 1, true);
                    deck.deal(new BlackjackHand[]{dealer}, 1, false);
                    deck.deal(new BlackjackHand[]{player, dealer}, 1, true);
                    
                    addObject(deck, 918, 243);
                    addObject(player, 550, 575);
                    addObject(dealer, 645, 274);
                    addObject(new HitButton(), 140, 630);
                    addObject(new StandButton(), 1140, 645);
                    addObject(new BackButton(), 1162, 43);
                }
            }
        }
    }
}
