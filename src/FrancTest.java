import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class FrancTest {
	
	@Test
	public void testMultiplication() {
    	Franc five = new Franc(5);
    	assertEquals(new Franc(10), five.times(2));
    	assertEquals(new Franc(15), five.times(3));
	}
}
