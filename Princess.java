import greenfoot.*;

/**
 * Write a description of class Princess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Princess extends Actor
{
    /**
     * Act - do whatever the Princess wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Mario.class))
        {
            Greenfoot.setWorld(new Finish());

            Greenfoot.stop();
        }
    }  
    public Princess(){
        GreenfootImage princeImg = getImage();
        princeImg.scale(45,45);
        setImage(princeImg);
    }
}
