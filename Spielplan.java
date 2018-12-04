import greenfoot.World;


public class Spielplan extends World {
    private Feld[] felder;
    
    public Spielplan() {
        super(8, 8, 64);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Koenig koenig = new Koenig();
        addObject(koenig,5,5);
        Ritter ritter = new Ritter();
        addObject(ritter,5,2);
        ritter.setImage("ritter.png");
    }
}