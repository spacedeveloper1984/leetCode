package easy.string;

/**
 * @author ogayvoronskiy
 * Created at 18.05.2022
 */
public class ImplementStr {
	public int strStr(String haystack, String needle) {
		int result = -1;
		if (haystack.equals(needle)) return 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				for (int j = 0; j < needle.length(); j++) {
					if (j + i > haystack.length() -1) {
						result = -1;
						break;
					}
					if (haystack.charAt(j + i) == needle.charAt(j)) {
						result = i;
					} else {
						result = -1;
						break;
					}
				}
				if (result != -1) break;
			}
		}
		return result;
	}
}
