package pl.enlight.catsimulator;

/**
 * Represents real cat object
 * @author enlight
 */
public class CatFifth {

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

    public void sleep() {
        if(canGoSleep()){
            setHungry(true);
        }
    }

    public boolean isHungry() {
        return hungry;
    }
}
