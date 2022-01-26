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
      GreenfootImage WinnerText = new GreenfootImage("YouWin.jpg");
    public Finish()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(screenX, screenY, 1); 
             getBackground().drawImage(WinnerText, 100, 0);
            WinnerText.scale(30,30);
        addObject(new Floor2(),0 , 400);
        addObject(new Floor2(),190 , 400);
        addObject(new Floor2(),380 , 400);
        addObject(new Floor2(),570 , 400);
        addObject(new Princess(), 180, 370);
        addObject(new Mario(), 450, 360);
    }
}
