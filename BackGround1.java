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
    public static int screenX = 1100;
    public static int screenY = 780;
    
    public static int plat1Height = 1000;
    public static int plat2Height = 580;
    public static int plat3Height = 400;
    public static int plat4Height = 219;
    
    /**
     * Constructor for objects of class BackGround1.
     * 
     */
    public BackGround1()
    {   
        super(screenX, screenY, 1); // super(1500, 1000, 1)
        addObject(new DK(), 100, 159);
        addObject(new Floor(), 110, plat4Height); // 125, 219.
        addObject(new Floor(), 310, plat4Height);
        addObject(new Floor(), 500, plat4Height);
        addObject(new Floor(), 700, plat4Height);
        addObject(new Floor2(), 400, plat3Height);
        addObject(new Floor2(), 600, plat3Height);
        addObject(new Floor2(), 800, plat3Height);
        addObject(new Floor2(), 1000, plat3Height);
        addObject(new Floor(), 110, plat2Height);
        addObject(new Floor(), 310, plat2Height);
        addObject(new Floor(), 500, plat2Height);
        addObject(new Floor(), 700, plat2Height);
        addObject(new Floor2(), 110, plat1Height);
        addObject(new Floor2(), 310, plat1Height);
        addObject(new Floor2(), 500, plat1Height);
        addObject(new Floor2(), 700, plat1Height);
        addObject(new Floor2(), 900, plat1Height);
        addObject(new Floor2(), 1100, plat1Height);
        addObject(new Mario(), 125, 700);
    }
}
