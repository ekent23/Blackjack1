import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.List; 
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck extends Actor
{
    
    private List<Card> cards;


    public Deck(){
        cards = new ArrayList<Card>();
        
    }
    
    public Deck(int numOfDecks){
        int numOfCards = numOfDecks*52;
        cards = new ArrayList<Card>(numOfCards);
        for (int deckCount=0; deckCount < numOfDecks; deckCount++) {
            for(Suit suit: Suit.values()){
                for(Rank rank: Rank.values()){
                    if (rank == Rank.JOKER){
                        continue;
                    }
                    cards.add(new Card(rank,suit));
                }
            }
        }
        shuffle();
        shuffle();
        if (numOfCards > 0){
            setImage(cards.get(numOfCards-1).getImage());
        }
    }

    public void shuffle(){
        Random rand = new Random();
        int numOfCards = cards.size();
        for(int index = 0; index < numOfCards-1; index++){
            int swapIndex = rand.nextInt(numOfCards-index) + index;
            Card temp = cards.get(index);
            cards.set(index, cards.get(swapIndex));
            cards.set(swapIndex, temp);
        }
    }

    /**
     * Grows the cards array by doubling the size of the array.
   said to delete 
    private void grow(){
        Card[] tempCards = new Card[cards.length*2];
        for(int index=0; index < numOfCards; index++){
            tempCards[index] = cards[index];
        }
        cards = tempCards;
    }
    */

    /**
     * Returns true if this deck is empty; otherwise true.
     */
    public boolean isEmpty(){
        return cards.isEmpty(); 
    }

    /**
     * Removes the first occurrence of aCard from the deck.  This method
     * will find the first occurrence of a card that has the same suit and
     * rank as aCard and remove it from the deck.
     * 
     * @param aCard an instance of a Card to be removed from the deck.
     */
    public boolean remove(Card aCard){
        return cards.remove(aCard);
    }

    /**
     * Adds a card aCard to this deck.
     * 
     * @param aCard an instance of a Card that is to be added to this deck.
     */
    public void add(Card aCard){
       cards.add(aCard);
    }

    /**
     * Deals a card from this deck by returning the top card on this deck.
     * 
     * @param isFaceUp true if you want the card to be dealt face up; otherwise false.
     * @returns an instance of Card from this deck.
     */
    public Card deal(boolean isFaceUp){
        Card topCard = deal();
        if (isFaceUp){
            topCard.show();
        }
        return topCard;
    }
    
    /**
     * Deals a card from this deck by returning the top card on this deck.
     */
    public Card deal(){
        return cards.remove(cards.size()-1);
    
    }

    /**
     * Deals cards from this deck to an array of decks giving numOfCardsToDeal to each
     * deck.  If isFaceUp is true, the cards are dealt face up; otherwise face down.
     * 
     * @param deck an array of Deck objects to which cards are dealt.
     * @param numOfCardsToDeal number of cards to deal to each deck.
     * @param isFaceUp if true, the cards are dealt face up; otherwise face down
     */
    public void deal(Deck[] deck, int numOfCardsToDeal, boolean isFaceUp){
        int maxCardCount = numOfCardsToDeal*deck.length;
        for (int cardCount=0; cardCount < maxCardCount; cardCount++){
            Card card = deal(isFaceUp);
            deck[cardCount % deck.length].add(card);
        }
    }
    
    /**
     * Returns the size of this deck.  That is, then number of cards in this deck.
     * 
     * @returns number of cards in this deck.
     */
    public int getSize(){
        return cards.size();
    }

    /**
     * Returns the array of cards in this deck.
     * 
     * @returns a reference to the array of cards in this deck.
     */
    protected List<Card> getCards(){
        return cards;    
    }
    
    @Override
    public String toString() {
        String str = "";
        for(Card c: cards){
            if (str.length() > 0){
                str +=", ";
            }
            str += c;
        }
        return str;
    }

    /**
     * Act - do whatever the Deck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
