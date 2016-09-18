package pl.enlight.catsimulator;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test for cat class
 * @author enlight
 */
public class CatFirstTest {

    @Test
    public void whenCatHasStatusHungryThenHasEmptyStomach(){
        CatFirst cat = new CatFirst();
        cat.setHungry(true);
        assertTrue(cat.hasEmptyStomach());
    }
    @Test
    public void whenCatNotHasStatusHungryThenNotHasEmptyStomach(){
        CatFirst cat = new CatFirst();
        cat.setHungry(false);
        assertFalse(cat.hasEmptyStomach());
    }
}
