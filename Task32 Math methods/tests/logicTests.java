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

		Assert.assertTrue("\n6\n4\n3\n2\n".equals(MethodsForProcessing.outputListDeviders(number)));
	}

	@Test
	public void testOutputCountOfDifferentDigits() {
		int number = 131;

		Assert.assertEquals(2, MethodsForProcessing.outputCountOfDifferentDigits(number));
	}

	@Test
	public void testOutputGCD() {
		int number1 = 72;
		int number2 = 48;

		Assert.assertEquals(24, MethodsForProcessing.outputGCD(number1, number2));
	}

	@Test
	public void testOutputLCM() {
		int number1 = 12;
		int number2 = 9;

		Assert.assertEquals(36, MethodsForProcessing.outputLCM(number1, number2));
	}

}
