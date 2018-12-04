import greenfoot.*;

public class Ritter extends Spielfigur {

	Spieler besitzer;
	
    public boolean moveAllowed(){
        int newX = Greenfoot.getMouseInfo().getX();
        int newY = Greenfoot.getMouseInfo().getY();
        int x = getX();
        int y = getY();
        
        if (newX==x // Zug senkrecht
            || newY==y) // Zug waagrecht
            return true;
        else return false;
    }

}