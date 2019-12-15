import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class FrancTest {
	
	@Test
	public void testMultiplication() {
    	Franc five = Money.franc(5);
    	assertEquals(Money.franc(10), five.times(2));
    	assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test 
	public void testEquality() {
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse((Money.dollar(5)).equals(Money.franc(5)));
 	}
}
