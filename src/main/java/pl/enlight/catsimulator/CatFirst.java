package pl.enlight.catsimulator;

/**
 * Represents real cat object
 * @author enlight
 */
public class CatFirst {

    private boolean hungry;
    
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
    
    public boolean hasEmptyStomach(){
        return hungry;
    }
}
