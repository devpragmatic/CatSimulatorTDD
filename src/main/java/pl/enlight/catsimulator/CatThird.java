package pl.enlight.catsimulator;

/**
 * Represents real cat object
 * @author enlight
 */
public class CatThird {

    private boolean hungry;
    private boolean fullStomach = false;
    
    public void setHungry(boolean hungry) {
        fullStomach = !hungry;
        this.hungry = hungry;
    }
    
    public boolean hasEmptyStomach(){
        return hungry;
    }

    public void eat() {
        fullStomach = true;
        hungry = false;
    }

    public boolean hasFullStomach() {
        return fullStomach;
    }
}
