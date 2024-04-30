import greenfoot.*;
/**
 * Write a description of class DoneButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoneButton  extends Actor
{
    // instance variables - replace the example below with your own
      public boolean isPressed;
    
  
    public DoneButton()
    {
        //GreenfootImage image = new GreenfootImage("Play Button.png");
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
