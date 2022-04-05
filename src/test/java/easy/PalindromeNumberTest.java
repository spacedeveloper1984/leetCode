package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ogayvoronskiy
 * Created at 05.04.2022
 */
class PalindromeNumberTest {

	PalindromeNumber palindromeNumber = new PalindromeNumber();

	@Test
	void isPalindrome() {
		assertTrue(palindromeNumber.isPalindrome(121));
		assertFalse(palindromeNumber.isPalindrome(-121));
		assertFalse(palindromeNumber.isPalindrome(10));
	}
}