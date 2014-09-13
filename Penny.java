import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penny here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penny extends Coin
{   
    float value;
    public Penny()
    {
        value = 1.0f;
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;        
    }
    
    public boolean equals( Object penny ) {
        if( null == penny ) {
            return false;
        }
        if( this.getClass() != penny.getClass() ) {
            return false;
        }
        if( this.value != ((Penny)penny).value ) {
            return false;
        }
        return true;
    }
    
}
