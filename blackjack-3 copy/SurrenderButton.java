import greenfoot.*;
/**
 * Write a description of class SkipButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SurrenderButton  extends Actor
{
  private boolean isPressed;
    
    public SurrenderButton()
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

