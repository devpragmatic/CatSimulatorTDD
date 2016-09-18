package pl.enlight.catsimulator;

/**
 * Represents real cat object
 * @author enlight
 */
public class CatFourth {

    private boolean hungry = true;
    
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
    
    public boolean hasEmptyStomach(){
        return hungry;
    }

    public void eat() {
        hungry = false;
    }

    public boolean hasFullStomach() {
        return !hungry;
    }

    public boolean canGoSleep() {
        return hasFullStomach();
    }
}
