package easy.math;

/**
 * @author ogayvoronskiy
 * Created at 05.04.2022
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		int input = x, reverse = 0;
		if (x<0 || x%10 == 0 && x !=0) return false;
		while (input != 0) {
			reverse = reverse*10 + input%10;
			input /= 10;
		}
		return reverse == x;
	}
}
