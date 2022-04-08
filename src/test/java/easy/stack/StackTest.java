package easy.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author ogayvoronskiy
 * Created at 08.04.2022
 */
public class StackTest {

    ValidParentheses validParentheses = new ValidParentheses();


    @Test
    @DisplayName("20. Valid Parentheses")
    void isValidTest() {
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertTrue(validParentheses.isValid("({[{}]{[]}{[]}})"));
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid(""));
        assertFalse(validParentheses.isValid("("));
        assertFalse(validParentheses.isValid(")(){}}"));
        assertFalse(validParentheses.isValid("())"));
    }
}
