import greenfoot.*;
/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton  extends Actor
{
  
    public boolean isPressed;
    
    public PlayButton()
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
