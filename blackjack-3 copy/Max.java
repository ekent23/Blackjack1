import greenfoot.*;

public class Max extends Actor {
    private int Maxamount;
    public Max() {
        Maxamount = 500;
        update(); // Call update method to initialize the image
    }
    
    public Max(int m) {
        Maxamount = m;
        update(); // Call update method to initialize the image
    }

    public void updateMax(int addedAmount) {
        Maxamount += addedAmount;
        update(); // Update the displayed amount
    }
    public int getMax(){
        return Maxamount;
    }


    private void update() {
        GreenfootImage image = new GreenfootImage("Max flex points: " + Maxamount, 35, Color.WHITE, Color.RED);
        setImage(image);
    }
}


