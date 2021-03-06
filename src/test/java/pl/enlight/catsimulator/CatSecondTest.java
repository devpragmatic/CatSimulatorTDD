package pl.enlight.catsimulator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for cat class
 * @author enlight
 */
public class CatSecondTest {
    private CatSecond cat;
    
    @Before
    public void initTest(){
        cat = new CatSecond();
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
}
