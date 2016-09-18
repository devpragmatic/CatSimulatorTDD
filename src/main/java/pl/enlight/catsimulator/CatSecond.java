package pl.enlight.catsimulator;

/**
 * Represents real cat object
 * @author enlight
 */
public class CatSecond {

    private boolean hungry;
    private boolean fullStomach = false;
    
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
    
    public boolean hasEmptyStomach(){
        return hungry;
    }

    public void eat() {
        fullStomach = true;
    }

    public boolean hasFullStomach() {
        return fullStomach;
    }
}
