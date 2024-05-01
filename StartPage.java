import greenfoot.*;
/**
 * Write a description of class StartPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartPage extends World 
{
 

    /**
     * Constructor for objects of class StartPage
     */
    public StartPage()
    { super(1246, 700, 1);
        addObject(new PlayButton(), 594, 374); 
        addObject(new RulesButton(), 612, 499);
    }
        public void act()
    {
        if (Greenfoot.mouseClicked(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                Actor clicked = mouse.getActor();
                if (clicked instanceof PlayButton) {
                    Greenfoot.setWorld(new BettingScreen());
                }
                
                if (clicked instanceof RulesButton) {
                    
                    Greenfoot.setWorld(new RulesPage());
                }}}}}