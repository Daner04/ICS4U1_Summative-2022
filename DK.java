import greenfoot.*;
public class DK extends Actor
{
    long lastTime;
   GreenfootImage DkThrowing = new GreenfootImage("Donkey_Kong_Classic_NES_Artwork.png");
    public void act() 
    {
        if(isTouching(Mario.class))
        {
            Greenfoot.setWorld(new Finish());

            Greenfoot.stop();
        }
        if(System.currentTimeMillis() - lastTime > 2500)
        {
            GreenfootImage image = new GreenfootImage(DkThrowing);
            lastTime = System.currentTimeMillis();
            image.scale(110, 110);
             setImage(image);
            getWorld().addObject(new Barrel(), getX(), getY());
        }
           if (System.currentTimeMillis() - lastTime > 300) {
           setImage("donkey-kong_standing.png");
        }
      
    } 
    public DK(){
        GreenfootImage dkImg = getImage();
        dkImg.scale(65,65);
        setImage(dkImg);
        
    }
   
}
