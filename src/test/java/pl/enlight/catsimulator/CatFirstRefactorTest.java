package pl.enlight.catsimulator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for cat class
 * @author enlight
 */
public class CatFirstRefactorTest {

    private CatFirst cat;
    
    @Before
    public void initTest(){
        cat = new CatFirst();
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
}
