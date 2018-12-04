import greenfoot.*;

public abstract class Spielfigur extends Actor {

	Feld ort;
	private String position;
	protected FarbeT farbe;
	
    public void act() 
    {
         
        if (Greenfoot.mouseDragEnded(this)) {
            // Position aktualisieren 
            if (moveAllowed()) { //[falls Zug erlaubt!]
                setLocation(Greenfoot.getMouseInfo().getX(),
                            Greenfoot.getMouseInfo().getY());
                
                            // andere Figur schlagen
                if (getOneIntersectingObject(Spielfigur.class) != null) {
                    // entfernen [falls Figur von gegnerischer Farbe!]
                 getWorld().removeObject(getOneIntersectingObject(Spielfigur.class));
                 
                }
            }
        }

    }
    
    abstract boolean moveAllowed() ;

}