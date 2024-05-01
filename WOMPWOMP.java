import greenfoot.*;
/**
 * Write a description of class WOMPWOMP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)

   */
public class WOMPWOMP  extends World
{
   
   

    /**
     * Constructor for objects of class WOMPWOMP
     */
    public WOMPWOMP()
    {
        super(1246, 700, 1);
        
        addObject(new BackButton(), 83, 49);
    }

     public void act()
    {
        
        if (Greenfoot.mouseClicked(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                Actor clicked = mouse.getActor();
                if (clicked instanceof BackButton) {
                    Greenfoot.setWorld(new StartPage());
                }}}}}

