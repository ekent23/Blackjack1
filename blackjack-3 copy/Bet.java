import greenfoot.*;

public class Bet extends Actor {
    private int amount;
    private int Maxamount;

    public Bet() {
        Maxamount = 500;
        amount = 0;
        update(); // Call update method to initialize the image
    }

    public void addAmount(int addedAmount) {
        amount += addedAmount; // Add the specified amount to the current amount
        if (amount > Maxamount){
            amount = Maxamount;
        }
        update(); // Update the displayed amount
    }
    public void updateMax(int newMax){
        Maxamount = newMax;
    }
    public int getAmount() {
        return amount;
    }

    private void update() {
        GreenfootImage image = new GreenfootImage("Amount: " + amount, 35, Color.WHITE, Color.RED);
        setImage(image);
    }
}


