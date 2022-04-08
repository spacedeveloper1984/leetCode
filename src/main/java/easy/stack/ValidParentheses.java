package easy.stack;

import java.util.Stack;

/**
 * @author ogayvoronskiy
 * Created at 08.04.2022
 */
public class ValidParentheses {
	public boolean isValid(String s) {
		if (s.isBlank() || !isOpen(s.charAt(0))) return false;
		Stack<Character> stack = new Stack();

		for (int i = 0; i < s.length(); i++) {
			if (isOpen(s.charAt(i))) {
				stack.push(s.charAt(i));
			} else {
				if (stack.size() > 0 && isPair(stack.peek(), s.charAt(i))) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.size() == 0;
	}

	private boolean isOpen(char c) {
		return c == '(' || c == '{' || c == '[';
	}

	private boolean isPair(char open, char close) {
		return open == '(' && close == ')' || open == '{' && close == '}' || open == '[' && close == ']';
	}
}
