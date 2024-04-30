import greenfoot.*;

public class BettingScreen extends World {
    private Bet betDisplay; // Reference to the bet display
    private Max max; 

    public BettingScreen() {
        super(1246, 700, 1);
        
        
        betDisplay = new Bet();
        max = new Max();
        betDisplay.updateMax(max.getMax());
        addObject(betDisplay, 1040,224);
        addObject(new Max(), 1066, 75);
      
        
        addObject(new TenButton(), 285, 353);
        addObject(new FiftyButton(), 667, 355);
        addObject(new HundredButton(), 1036, 353);
        addObject(new DoneButton(), 1103, 587);
    }
    
    public BettingScreen(int maxAmount) {
        super(1246, 700, 1);
        
        
        betDisplay = new Bet();
        max = new Max(maxAmount);
        betDisplay.updateMax(max.getMax());
        addObject(betDisplay, 1040,224);
        addObject(max, 1066, 75);
      
        
        addObject(new TenButton(), 285, 353);
        addObject(new FiftyButton(), 667, 355);
        addObject(new HundredButton(), 1036, 353);
        addObject(new DoneButton(), 1103, 587);
    }

    public void act() {
        
        if (Greenfoot.mouseClicked(null)) {
            Actor clickedActor = Greenfoot.getMouseInfo().getActor();
            if (clickedActor != null) {
                if (clickedActor instanceof TenButton) {
                    betDisplay.addAmount(10); 
                } else if (clickedActor instanceof FiftyButton) {
                    betDisplay.addAmount(50); 
                } else if (clickedActor instanceof HundredButton) {
                    betDisplay.addAmount(100); 
                } else if (clickedActor instanceof DoneButton) {
                    Greenfoot.setWorld(new BlackjackWorld(betDisplay, max));
                
            }
        }
    }
}}

    
 