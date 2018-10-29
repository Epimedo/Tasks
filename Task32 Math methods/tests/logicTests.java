import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import epam.halavin.task32.model.MethodsForProcessing;
import junit.framework.Assert;

public class logicTests {

	@Test
	public void testOutputLargestDigit() {
		int number = 1234980;

		Assert.assertEquals(9, MethodsForProcessing.outputLargestDigit(number));
	}

	@Test
	public void testIsNumberPalindromeFirst() {
		int number = 13131;

		Assert.assertEquals(true, MethodsForProcessing.isNumberPalindrome(number));
	}

	@Test
	public void testIsNumberPalindromeSecond() {
		int number = 134531;

		Assert.assertEquals(false, MethodsForProcessing.isNumberPalindrome(number));
	}

	@Test
	public void testIsNumberSimpleFirst() {
		int number = 13;

		Assert.assertEquals(true, MethodsForProcessing.isNumberSimple(number));
	}

	@Test
	public void testIsNumberSimpleSecond() {
		int number = 12;

		Assert.assertEquals(false, MethodsForProcessing.isNumberSimple(number));
	}

	@Test
	public void testOutputListDeviders() {
		int number = 12;

		Assert.assertEquals("\n6\n4\n3\n2\n".hashCode(), MethodsForProcessing.outputListDeviders(number).hashCode());
	}

	@Test
	public void testOutputCountOfDifferentDigits() {
		fail("Not yet implemented");
	}

	@Test
	public void testOutputGCD() {
		fail("Not yet implemented");
	}

	@Test
	public void testOutputLCM() {
		fail("Not yet implemented");
	}

}
