import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class Coin to get the coin in gameball world.
 * 
 * @author Ramnivas Indani
 */
public class Coin extends Actor
{
     boolean isValidCoin = false;
   
    public void act() 
    {
        int mouseX, mouseY ;
        
        if( Greenfoot.mouseDragged( this ) ) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
        } 
    }
    
    /**
     * set if valid coin is inserted.
     */
    public void setIsValidCoin( boolean isValid ){
        isValidCoin = isValid;
    }
   
    /**
     * get if the valid coin is inserted.
     */
    public boolean getisValidCoin(){
        return isValidCoin;
    }
}
