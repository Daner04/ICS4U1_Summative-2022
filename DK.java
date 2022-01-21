import greenfoot.*;
public class DK extends Actor
{
    long lastTime;
  
    public void act() 
    {
        if(isTouching(Mario.class))
        {
            Greenfoot.setWorld(new Finish());

            Greenfoot.stop();
        }
        if(System.currentTimeMillis() - lastTime > 2500)
        {
            lastTime = System.currentTimeMillis();
            getWorld().addObject(new Barrel(), getX(), getY());
           

        }
      
    } 
    public DK(){
        GreenfootImage dkImg = getImage();
        dkImg.scale(110,110);
        setImage(dkImg);
    }
}
