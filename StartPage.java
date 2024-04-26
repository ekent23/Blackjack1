import greenfoot.*;
/**
 * Write a description of class StartPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartPage extends World 
{
    // instance variables - replace the example below with your own
 

    /**
     * Constructor for objects of class StartPage
     */
    public StartPage()
    { super(1246, 700, 1);
        addObject(new PlayButton(), 594, 374); //places play button screen
        addObject(new RulesButton(), 612, 499);//places rules button screen
    }
        public void act()
    {
        if (Greenfoot.mouseClicked(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                Actor clicked = mouse.getActor();
                if (clicked instanceof PlayButton) {
                    Greenfoot.setWorld(new BlackjackWorld());
                }
                
                if (clicked instanceof RulesButton) {
                    
                    Greenfoot.setWorld(new RulesPage());
                }}}}}