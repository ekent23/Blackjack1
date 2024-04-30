import greenfoot.*;

public class Flex extends Actor {
    
    public Flex() {
        setImage(new GreenfootImage("Flex amount: 500", 35, Color.WHITE, Color.RED));
    }
    
    public Flex(String text, int fontSize, Color textColor, Color bgColor) {
        setImage(new GreenfootImage(text, 20, textColor, bgColor));
    }
    
    public void setText(String text) {
        GreenfootImage image = getImage();
        image.clear(); // Clear existing image
        image.drawString(text, 0, 20); // Draw new text
    }
}


