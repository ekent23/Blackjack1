import greenfoot.*;

public class TenButton extends Actor {
     private boolean isPressed;
    
    public TenButton()
    {
        //GreenfootImage image = new GreenfootImage("Stand Button.png");
        //setLocation(60,100);
    }
    
    public void pressed(){
        isPressed = !isPressed;

    }
    
    public boolean is_pressed(){
        return isPressed;
    }
    
    public void act()
    { if(Greenfoot.mouseClicked(this)) {
        pressed();

    }
    }
}
