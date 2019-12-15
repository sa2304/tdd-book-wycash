import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class DollarTest {
	@Test
	public void testMultiplication() {
    	Money five = Money.dollar(5);
    	assertEquals(Money.dollar(10), five.times(2));
    	assertEquals(Money.dollar(15), five.times(3));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse((Money.dollar(5)).equals(new Franc(5)));
	}
	
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(new Dollar(5)));
		assertFalse(Money.dollar(5).equals(new Dollar(6)));
	}
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
}
