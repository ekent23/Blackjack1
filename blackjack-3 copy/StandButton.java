import greenfoot.*;
/**
 * Write a description of class StandButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandButton extends Actor
{
    private boolean isPressed;
    
    public StandButton()
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
