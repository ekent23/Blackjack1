import greenfoot.*;
/**
 * Write a description of class Fiftybutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HundredButton  extends Actor
{
   private boolean isPressed;
    
    public HundredButton()
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
