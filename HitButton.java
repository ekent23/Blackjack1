import greenfoot.*;
/**
 * 
 * 
 * Write a description of class HitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HitButton  extends Actor
{
    
    public boolean isPressed;
    
    public HitButton()
    {
        //GreenfootImage image = new GreenfootImage("Hit Button.png");
        //setLocation(60,100);
    }
    
    public void pressed(){
        isPressed = true;
    }
    
    public boolean is_pressed(){
        return isPressed;
    }
    
    public void act()
    { if(Greenfoot.mouseClicked(this)) {
        pressed();
        isPressed = false;
    }
    }
}
