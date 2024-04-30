import greenfoot.*;
/**
 * Write a description of class RulesPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RulesPage extends World 

{
    // instance variables - replace the example below with your own
  

    /**
     * Constructor for objects of class RulesPage
     */
    public RulesPage()
    {
        super(1246, 710, 1);
        addObject(new BackButton(), 83, 49);//places rules button screen
    }
}
      /*  public void act()
    {
        
        if (Greenfoot.mouseClicked(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                Actor clicked = mouse.getActor();
                if (clicked instanceof BackButton) {
                    Greenfoot.setWorld(new StartPage());
                }}}}}*/