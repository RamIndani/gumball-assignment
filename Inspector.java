import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Class Inspector inspects the coin inserted into the Gumball machine.
 * If the coin is valid it activates the GreenPicker or RandomPicker to take the gumball out of machine.
 * Ramnivas Indani
 * @version (a version number or a date)
 */
public class Inspector extends Alien 
{
   private static Inspector inspector = null;
   private ArrayList<Picker> pickerList = new ArrayList<Picker>();
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }
    /**
     * add the picker into the ArrayList inorder to get the gumball out of Gumball machine.
    */
    private void setPicker(Picker picker){
        pickerList.add(picker);
    }
    /**
     * get the picker out of the ArrayList in order to get the gumball out of machine.
     */
    private Picker getPicker(int picker){
      return  pickerList.remove(picker);
    }
    
    /**
     * Check if the coin is valid Quarter or not.
     */
    public void isValidCoin ( Coin insertedCoin ) {
        Quarter validQuarter = new Quarter();
        boolean isValidCoin = validQuarter.equals( insertedCoin ) ? true:false;
        ((Coin)insertedCoin).setIsValidCoin(isValidCoin);
        if( isValidCoin ) {
            setPicker(getPickerRandom());
        }
    }
    
    /**
     * When crank is pressed on Gumball machine check if quater is added if added then get the gumball out else not.
     */
    public void crankPressed ( ) {
        int numberOfPickers = pickerList.size();
        if(numberOfPickers>0){
            int getPickerOutRandomly = Greenfoot.getRandomNumber( numberOfPickers );
            Picker pickerChosen = getPicker(getPickerOutRandomly);
            pickerChosen.pick();
        }
    }
    
    /**
     * select one of the picker from RandomPicker or GreenPicker.
     */
    private Picker getPickerRandom(){
        int getPickerRandomly = Greenfoot.getRandomNumber(2);
        Picker randomlyGeneratedPicker = null;
        World world = getWorld();
        switch( getPickerRandomly ) {
            case 0:{
                System.out.println("world "+(GreenPicker)world.getObjects(GreenPicker.class).get(0));
                randomlyGeneratedPicker = (GreenPicker)world.getObjects(GreenPicker.class).get(0);
                break;
            }
            case 1: {
                System.out.println("world "+(RandomPicker)world.getObjects(RandomPicker.class).get(0));
                randomlyGeneratedPicker = (RandomPicker)world.getObjects(RandomPicker.class).get(0);
                break;
            }
        }
        return randomlyGeneratedPicker;
    }
}
