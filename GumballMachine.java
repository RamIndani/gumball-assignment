import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class GumballMachine is machine which accepts quater and gets gumball out if crank is pressed after inserting valid quarter.
 * 
 * @author Ramnivas Indani
 *
 */
public class GumballMachine extends Actor
{
    private boolean isHavingValidCoin = false;
    Message message = new Message();
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        Actor coin;
        Inspector inspector;
        coin = getOneIntersectingObject( Coin.class ) ;
        if ( coin != null )
        {
            World world = getWorld() ;
            world.removeObject( coin ) ;
            Coin coinInstance = ((Coin)coin);
            inspector = (Inspector)world.getObjects(Inspector.class).get(0);
            inspector.isValidCoin((Coin)coin);
            isHavingValidCoin = coinInstance.getisValidCoin();
            if ( isHavingValidCoin ) {
                textNotification("Have valid coin");
            } else {
                textNotification("Fake coin!");
            }
        }
        
        if(Greenfoot.mousePressed(this) && isHavingValidCoin) {          
            textNotification("Crank Turned!");
            getGumballOut();
        }else if( Greenfoot.mousePressed(this) && !isHavingValidCoin) {
            textNotification("Please insert valid coin");
        }
    }
    
    /**
     * generate text notification of message passed.
     */
    private void textNotification( String textMessage ) {
       GreenfootImage gi = new GreenfootImage(50,50);
       World world = getWorld();
       if( null != world){
           world.removeObject( message );
        }
       world.addObject(message,200,50);
       message.setText(textMessage);
    }
    
    /**
     * If crank is pressed then valid quarter is added then get the gumball out.
     */
    private void getGumballOut( ){
         World world = getWorld() ;
        Inspector inspector = (Inspector)world.getObjects(Inspector.class).get(0);
            inspector.crankPressed();
    }
    
}
