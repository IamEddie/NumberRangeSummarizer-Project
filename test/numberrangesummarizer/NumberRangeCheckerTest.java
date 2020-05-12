package numberrangesummarizer;

import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edmore
 */
public class NumberRangeCheckerTest {
    
    /**
     * Test of collect method, of class NumberRangeChecker.
     */
    @Test
    public void testCollect() {
        System.out.println("collect");
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        NumberRangeChecker instance = new NumberRangeChecker();
        //Collection<Integer> expResult = null;
        Collection<Integer> result = instance.collect(input);
        System.out.println(result);
    }

    /**
     * Test of summarizeCollection method, of class NumberRangeChecker.
     */
    @Test
    public void testSummarizeCollection() {
        System.out.println("summarizeCollection");
        Collection<Integer> input = null;
        NumberRangeChecker instance = new NumberRangeChecker();
        String expResult = "";
        String result = instance.summarizeCollection(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
