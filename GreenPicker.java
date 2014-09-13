import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    public Picker getGreenPicker() { 
        return this;
    }
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      World world = getWorld() ;
    }
    
    public void pick() {
        World world = getWorld() ;
        Gumball gb = new GreenGumball();
        world.addObject( gb, 500, 500 );
        removeObjectFromWorld(gb,world);
    }
    
    private void removeObjectFromWorld(final Gumball gb, final World world){
        Runnable runnable = new Runnable(){
            public void run(){
                try{
                Thread.sleep(1000);
                world.removeObject(gb);
                }catch(InterruptedException interruptedException){
                    return;
                }
            }
        };
        new Thread(runnable).start();
    }
}
