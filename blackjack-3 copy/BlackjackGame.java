import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackJackGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackjackGame extends CardGame
{
    private BlackjackHand[] hands;
    private BlackjackHand dealer;
    private int numberOfHands;
    private int numberOfDecks; // Added field for storing numberOfDecks
    
    public BlackjackGame(int numberOfDecks, int maxNumberOfHands)
    {
        super(numberOfDecks);    
        this.numberOfDecks = numberOfDecks; 
        hands = new BlackjackHand[maxNumberOfHands];
        dealer = new BlackjackHand("Dealer");
        numberOfHands = 0;
    }
    

    public void join(String name)
    {
        if (numberOfHands < hands.length){
            hands[numberOfHands] = new BlackjackHand(name);
            numberOfHands++;
        }
    }
    
    public void leave(String name)
    {
        boolean isFound = true;
        for(int index=0; index < numberOfHands; index++){
            if (!isFound){
                if (hands[index].getName().equals(name)){
                    isFound = true;
                } 
            } else {
                hands[index-1] = hands[index];
            }
        }
        if (isFound) {
            numberOfHands--;
            hands[numberOfHands] = null;
        }
    }
    
    public void deal(){
        // Implement your code here
    }
    
    /**
     * Act - do whatever the BlackJackGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
