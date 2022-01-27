import greenfoot.*;

/**
 * Write a description of class BackGround1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround1 extends World
{
    //Dimensions of the screen.
    public static int screenX = 900;
    public static int screenY = 580;
    
    public static int plat1Height = 580;
    public static int plat2Height = 480;
    public static int plat3Height = 380;
    public static int plat4Height = 280;
    
    /**
     * Constructor for objects of class BackGround1.
     * 
     */
    public BackGround1()
    {   
        super(screenX, screenY, 1); // super(1500, 1000, 1)
        addObject(new DK(), 190, 80);
        addObject(new Floor(), 80, plat4Height); // 125, 219.
        addObject(new Floor(), 260, plat4Height);
        addObject(new Floor(), 450, plat4Height);
        addObject(new Floor(), 640, plat4Height);
        addObject(new Floor2(), 270, plat3Height);
        addObject(new Floor2(), 460, plat3Height);
        addObject(new Floor2(), 640, plat3Height);
        addObject(new Floor2(), 820, plat3Height);
        addObject(new Floor(), 90, plat2Height);
        addObject(new Floor(), 280, plat2Height);
        addObject(new Floor(), 630, plat2Height);
        addObject(new Floor(), 810, plat2Height);
        addObject(new Floor2(), 80, plat1Height);
        addObject(new Floor2(), 260, plat1Height);
        addObject(new Floor2(), 430, plat1Height);
        addObject(new Floor2(), 610, plat1Height);
        addObject(new Floor2(), 800, plat1Height);
        addObject(new Floor(), 150, 110);
        addObject(new Mario(), 125, 550);
        addObject(new Princess(), 50, 240);
    }
}
