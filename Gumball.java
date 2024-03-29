import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gumball extends Actor
{
    private boolean isGumballRequested = false;
    
    public Gumball()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;
        
    }

    public void act() 
    {
        // Add your action code here.
        World world = getWorld();
        System.out.println("World in Gumball : "+world);
    }
    
    public void setIsGumballRequested( boolean requestGumball ) {
        isGumballRequested = true;
    }
    
    public boolean getIsGumballRequested() {
        return isGumballRequested;
    }
}
