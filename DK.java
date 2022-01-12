import greenfoot.*;
public class DK extends Actor
{
    long lastTime;
    String DKimage ="Donkey_Kong_Classic_NES_Artwork.png";
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
               // setImage("Donkey_Kong_Classic_NES_Artwork.png");
            getWorld().addObject(new Barrel(), getX(), getY());
             setImage("Donkey_Kong_Classic_NES_Artwork.png");
            
             Greenfoot.delay(8);
            setImage("donkey-kong_standing.png");

        }
      
    } 
}
