import greenfoot.*;

public class Koenig extends Spielfigur {

    public Koenig()
	{
		farbe = FarbeT.WEISS;
	}
	
	 public boolean moveAllowed(){
        int newX = Greenfoot.getMouseInfo().getX();
        int newY = Greenfoot.getMouseInfo().getY();
        int x = getX();
        int y = getY();
        
        if ((Math.abs(newX-x) <=1)
            && (Math.abs(newY-y) <= 1))
            return true;
            else return false;
    }

}