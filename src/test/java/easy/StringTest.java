package easy;

import easy.string.ImplementStr;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ogayvoronskiy
 * Created at 18.05.2022
 */
public class StringTest {

    ImplementStr implementStr = new ImplementStr();

	@Test
	@DisplayName("28. Implement strStr()")
	void implementStr() {
		assertEquals(2, implementStr.strStr("hello", "ll"));
		assertEquals(-1, implementStr.strStr("aaaaa", "bba"));
		assertEquals(8, implementStr.strStr("fdfgerilnsaf", "ns"));
		assertEquals(-1, implementStr.strStr("sdgnghmfddffadsfsdf", "dft"));
		assertEquals(-1, implementStr.strStr("mississippi", "a"));
		assertEquals(4, implementStr.strStr("mississippi", "issip"));
		assertEquals(0, implementStr.strStr("a", "a"));
		assertEquals(2, implementStr.strStr("abc", "c"));
		assertEquals(0, implementStr.strStr("aaa", "aaa"));
		assertEquals(1, implementStr.strStr("mississippi", "issi"));
		assertEquals(9, implementStr.strStr("mississippi", "pi"));
		assertEquals(6, implementStr.strStr("mississippi", "sipp"));
	}
}
