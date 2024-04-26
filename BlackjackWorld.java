import greenfoot.*;

public class BlackjackWorld extends World {

    private boolean playerTurn = true;
    private boolean dealerTurn = false;
    private Deck deck;
    private BlackjackHand player;
    private BlackjackHand dealer;
    private BlackjackHand[] players;

    public BlackjackWorld() {
        super(1246, 700, 1);
        deck = new Deck(1); 
        player = new BlackjackHand("Jimmy");
        dealer = new BlackjackHand("Tony Allen");
   
        deck.shuffle();
        deck.deal(new BlackjackHand[]{player}, 1, true);
        deck.deal(new BlackjackHand[]{dealer}, 1, false);
        deck.deal(new BlackjackHand[]{player, dealer}, 1, true);
        
        addObject(deck, 918,243);
        addObject(player, 550, 575);
        addObject(dealer, 645, 274);
        addObject(new HitButton(), 140, 630);
        addObject(new StandButton(), 1140, 645);
        
    }
    public void act() {
    if (playerTurn) {
        if (Greenfoot.mouseClicked(null)) {
            Actor clicked = Greenfoot.getMouseInfo().getActor();
            if (clicked instanceof HitButton) {
                //deck.deal(new BlackjackHand[]{player}, 1, true);
                player.add(deck.deal(true));
                if ((player.getWeight() >= 21) || (player.getWeight()==-1)) { 
                    playerTurn = false;
                    dealerTurn = true;
                }
            } else if (clicked instanceof StandButton) {
                playerTurn = false;
                dealerTurn = true;
                
            }
        }
    
    } else if (dealerTurn){
        dealer.show();
        while (dealer.getWeight() < 17 && dealer.getWeight() != -1) {
            dealer.add(deck.deal(true));
        }
        // Once the dealers hand reaches 17 it ends their end the turn
        dealerTurn = false;
        
    } else if (!(dealerTurn && playerTurn)) {
        if (dealer.getWeight() == player.getWeight()){
        addObject(new Draw(), 115, 142);
        } else if (player.getWeight() > dealer.getWeight()){
           
        addObject(new YouWin(), 115, 142);
        } else if ((dealer.getWeight() > player.getWeight())){
            addObject(new YouLose(), 115, 142);
        
        }
        //reset()
        
        
    
    }
    System.out.print("\n");
}


}