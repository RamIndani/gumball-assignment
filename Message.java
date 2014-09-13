import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    GreenfootImage gi;
    public Message() {
       gi = new GreenfootImage(150,50);
       setImage(gi);
    }
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if( Greenfoot.mousePressed( this ) ) {
           World world = getWorld();
           world.removeObject(this);
        }
    }
    public void setText( String message ) {
       gi.clear();
       gi.setColor( java.awt.Color.BLACK ) ;
       gi.fill() ;
       gi.setColor( java.awt.Color.WHITE ) ;
       gi.drawString( message, 20, 20 );
    }
}
