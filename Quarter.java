import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class Quarter is the representation of the .
 * 
 * @author Ramnivas Indani
 * @version (a version number or a date)
 */
public class Quarter extends Coin
{
    float value;
    public Quarter()
    {
        value = 0.25f;
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ;           
    }
    
    /**
     * Overrides the equals method in order to check the equality of the Quarter class.
     */
    @Override
    public boolean equals( Object quarter ) {
        if( null == quarter ) {
             return false;
        }
        if( this.getClass() != quarter.getClass() ) {
            return false;
        }
        if( this.value != ((Quarter)quarter).value ) {
            return false;
        }
        return true;
    }
  
}
