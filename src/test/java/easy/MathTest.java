package easy;

import easy.math.PalindromeNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author ogayvoronskiy
 * Created at 11.05.2022
 */
public class MathTest {

	PalindromeNumber palindromeNumber = new PalindromeNumber();

	@Test
	@DisplayName("9. Palindrome Number")
	void isPalindromeTest() {
		assertTrue(palindromeNumber.isPalindrome(121));
		assertFalse(palindromeNumber.isPalindrome(-121));
		assertFalse(palindromeNumber.isPalindrome(10));
	}
}
