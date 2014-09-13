import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class RandomPicker picks the gumball randomly from the gumball machine one cronk is pressed after inserting a valid quarter.
 * 
 * @author Ramnivas Indani
 */
public class RandomPicker extends Picker
{
    public Picker getRandomPicker() {
        return this;
    }
   
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }
    
    /**
     * pick the picker randomly to get the random gumball out of the gumball machine.
     */
    public void pick(){
        
        Gumball gb = new GreenGumball();
        int randomGumball = Greenfoot.getRandomNumber(3);
        switch ( randomGumball ) {
            case 0: {
                gb = new BlueGumball();
                break;
            }
            case 1: {
                gb = new GreenGumball();
                break;
            }
            case 2: {
                gb = new RedGumball();
                break;
            }
        }
       World world = getWorld();
        System.out.println("World : "+world+" Gumball"+gb);
        world.addObject(gb, 500, 500);
        removeObjectFromWorld(gb,world);
    }
    
    /**
     * once gumball appears on screen new thread is created and it waits for 1 second and then removes the gumball from the world
     * and represents it as gumball picked when it gets out of gumball machine.
     */
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
