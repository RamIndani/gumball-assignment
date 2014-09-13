import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FakeQuarter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FakeQuarter extends Quarter
{
    float value;
    public FakeQuarter()
    {
        value = -0.25f;
        GreenfootImage image = getImage() ;
        image.scale( 75, 75 ) ; 
    }
    
    
    public boolean equals( Object fakeQuarter ){
        if( null == fakeQuarter ) {
            return false;
        }
        if( this.getClass() != fakeQuarter.getClass() ){
            return false;
        }
        if( this.value != ((FakeQuarter)fakeQuarter).value ) {
            return false;
        }
        return true;
    }
    
}
