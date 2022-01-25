import greenfoot.*;
public class Mario extends Actor
{
    int speed;
    String Marioimage = "mariopixelCopy.png";
    long lastTime;
   GreenfootImage CrossOut = new GreenfootImage("X.png");
    GreenfootImage mushroomLiveCounter = new GreenfootImage("murshrum.jpg");
    int Lives = 3;
    public void act() 
    {
        speed = speed + 1;
        setLocation( getX(), getY() + speed);
        GreenfootImage Mushroom = new GreenfootImage(mushroomLiveCounter);
        Mushroom.scale(50, 50);
        GreenfootImage Cross = new GreenfootImage(CrossOut);
        Cross.scale(50, 50);
      
            if(Lives == 1 && Lives != 2 && Lives != 3){
               getWorld().getBackground().drawImage(Mushroom, 990, 30);
                getWorld().getBackground().drawImage(Cross, 930, 30);
               getWorld().getBackground().drawImage(Cross, 870, 30);
        }
           if(Lives != 1 && Lives == 2 && Lives != 3){
               getWorld().getBackground().drawImage(Mushroom, 990, 30);
         getWorld().getBackground().drawImage(Mushroom, 930, 30);
           getWorld().getBackground().drawImage(Cross, 870, 30);
         
            }
            if(Lives != 1 && Lives != 2 && Lives == 3 ){
          getWorld().getBackground().drawImage(Mushroom, 990, 30);
         getWorld().getBackground().drawImage(Mushroom, 930, 30);
         getWorld().getBackground().drawImage(Mushroom, 870, 30);
            }
       
        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            Lives = Lives - 1;
            
        }
        if(Lives == 0)
        {
           getWorld().getBackground().drawImage(Cross, 990, 30);
           getWorld().getBackground().drawImage(Cross, 930, 30);
           getWorld().getBackground().drawImage(Cross, 870, 30);
            getWorld().showText("GAME OVER", 550,70);
            Greenfoot.stop();
        }
        if(speed > 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() - 1);
                if(Greenfoot.isKeyDown("up"))
                {
                    speed = - 27;
                }
            }
        }
        if(speed <= 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() + 1);
            }
        }    
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            if(System.currentTimeMillis() - lastTime > 500 
            && Marioimage.equals("mariopixelCopy.png"))
            { 
                Marioimage = "marioleft.png";
                setImage("marioleft.png");
               
                lastTime = System.currentTimeMillis();
            } else {
                if(System.currentTimeMillis() - lastTime > 500)
                {
                    Marioimage = "mariopixelCopy.png";
                     setImage("mariopixelCopy.png");
                    lastTime = System.currentTimeMillis();
                }
            } 
            
           
            setImage("mariopixelCopy.png");
            while(isTouching(Floor.class))
            {
               move(1);
            } 
        } else {
            if(Greenfoot.isKeyDown("right"))
            {
               move(5);
            
               setImage("mariopixel.png");
                while(isTouching(Floor.class))
                {
                  move(-1);
               }
            } else{
                setImage("mario-big.png");
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            speed = 50;
        }
    } 
     
}
