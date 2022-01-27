import greenfoot.*;
public class DK extends Actor
{
    long lastTime;
   GreenfootImage DkThrowing = new GreenfootImage("Donkey_Kong_Classic_NES_Artwork.png");
     GreenfootImage DkStanding = new GreenfootImage("donkey-kong_standing.png");
   public void act() 
    {
        if(!isTouching(Mario.class))
        {
            Greenfoot.setWorld(new Finish());

            Greenfoot.stop();
        }
        if(System.currentTimeMillis() - lastTime > 2500)
        {
            lastTime = System.currentTimeMillis();
           DkThrowing.scale(50,50);
             setImage(DkThrowing);
            getWorld().addObject(new Barrel(), getX(), getY());
        }
           if (System.currentTimeMillis() - lastTime > 300) {
                 DkStanding.scale(50, 50);
                 setImage( DkStanding);
        }
      
    } 
    public DK(){
        GreenfootImage dkImg = getImage();
        dkImg.scale(50,50);
        setImage(dkImg);
        
    }
   
}
