import greenfoot.*;
/**
 * Write a description of class StandButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Actor
{
    private boolean isPressed;
    
    public BackButton()
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
        
         if (Greenfoot.mouseClicked(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                Actor clicked = mouse.getActor();
                if (clicked instanceof BackButton) {
                    Greenfoot.setWorld(new StartPage());
                }}}}}

    }
