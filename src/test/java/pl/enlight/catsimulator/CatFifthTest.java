package pl.enlight.catsimulator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for cat class
 * @author enlight
 */
public class CatFifthTest {
    private CatFifth cat;
    
    @Before
    public void initTest(){
        cat = new CatFifth();
    }
    
    @Test
    public void whenCatHasStatusHungryThenHasEmptyStomach(){
        cat.setHungry(true);
        assertTrue(cat.hasEmptyStomach());
    }
    @Test
    public void whenCatNotHasStatusHungryThenNotHasEmptyStomach(){
        cat.setHungry(false);
        assertFalse(cat.hasEmptyStomach());
    }

    @Test
    public void whenCatAteThenHasFullStomach(){
        cat.eat();
        assertTrue(cat.hasFullStomach());
    }
    
    @Test
    public void whenCatNotAteThenNotHasFullStomach(){
        assertFalse(cat.hasFullStomach());
    }
    
    @Test
    public void whenCatHasFullStomachThenNotHasEmptyStomach(){
        cat.setHungry(true);
        cat.eat();
        assertTrue(cat.hasFullStomach());
        assertFalse(cat.hasEmptyStomach());
    }
    
    @Test
    public void whenCatHasEmptyStomachThenNotHasFullStomach(){
        cat.eat();
        cat.setHungry(true);
        assertTrue(cat.hasEmptyStomach());
        assertFalse(cat.hasFullStomach());
    }
    
    @Test
    public void whenCatHasFullStomachThenCanGoSleep(){
        cat.eat();
        assertTrue(cat.canGoSleep());
    }
    
    @Test
    public void whenCatNotHasFullStomachTenCanNotGoSleep(){
        cat.setHungry(true);
        assertFalse(cat.canGoSleep());
    }
    
    @Test
    public void whenCatSleptThenIsHungry(){
        cat.eat();
        cat.sleep();
        assertTrue(cat.isHungry());
    }
}
