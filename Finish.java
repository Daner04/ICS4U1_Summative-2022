import greenfoot.*;

/**
 * Write a description of class Finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finish extends World
{
    public static int screenX = 600;
    public static int screenY = 400;
 
    public Finish()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(screenX, screenY, 1); 
        addObject(new Floor2(),0 , 400);
        addObject(new Floor2(),200 , 400);
        addObject(new Floor2(),400 , 400);
        addObject(new Floor2(),600 , 400);
        addObject(new Princess(), 200, 350);
        addObject(new Mario(), 300, 350);
        showText("YOU WIN",300, 100);
    }
}
