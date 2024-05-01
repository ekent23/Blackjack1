import greenfoot.*;

public class Max extends Actor {
    private int Maxamount;
    public Max() {
        Maxamount = 500;
        update(); 
    }
    
    public Max(int m) {
        Maxamount = m;
        update(); 
    }

    public void updateMax(int addedAmount) {
        Maxamount += addedAmount;
        update(); 
    }
    public int getMax(){
        return Maxamount;
    }


    private void update() {
        GreenfootImage image = new GreenfootImage("Max flex points: " + Maxamount, 35, Color.WHITE, Color.RED);
        setImage(image);
    }
}


