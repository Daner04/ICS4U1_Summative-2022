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
             setImage("Donkey_Kong_Classic_NES_Artwork.png");    
            getWorld().addObject(new Barrel(), getX(), getY());
           

        }
           if (System.currentTimeMillis() - lastTime > 300) {
           setImage("donkey-kong_standing.png");
        }
      
    } 
    public DK(){
        GreenfootImage dkImg = getImage();
        dkImg.scale(110,110);
        setImage(dkImg);
    }
   
}
