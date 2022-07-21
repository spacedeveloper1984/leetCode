package easy;

import easy.math.PalindromeNumber;
import easy.math.Sqrt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ogayvoronskiy
 * Created at 11.05.2022
 */
public class MathTest {

	PalindromeNumber palindromeNumber = new PalindromeNumber();
	Sqrt sqrt = new Sqrt();

	@Test
	@DisplayName("9. Palindrome Number")
	void isPalindromeTest() {
		assertTrue(palindromeNumber.isPalindrome(121));
		assertFalse(palindromeNumber.isPalindrome(-121));
		assertFalse(palindromeNumber.isPalindrome(10));
	}

	@Test
	@DisplayName("69. Sqrt(x)")
	void sqrtTest() {
		assertEquals(2, sqrt.sqrt(4));
		assertEquals(2, sqrt.sqrt(8));
		assertEquals(3, sqrt.sqrt(9));
		assertEquals(4, sqrt.sqrt(18));
		assertEquals(9, sqrt.sqrt(81));
		assertEquals(12, sqrt.sqrt(144));
	}

	@Test
	@DisplayName("69. Sqrt(x)")
	void isPerfectSquareTest() {
		assertTrue(sqrt.isPerfectSquare(144));
		assertTrue(sqrt.isPerfectSquare(16));
		assertFalse(sqrt.isPerfectSquare(14));
		assertTrue(sqrt.isPerfectSquare(1));
		assertTrue(sqrt.isPerfectSquare(808201));
	}
}
