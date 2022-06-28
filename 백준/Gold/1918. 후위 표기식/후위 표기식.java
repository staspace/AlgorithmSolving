import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		String expr = sc.next();
		sc.close();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expr.length(); i++) {
			char exprCh = expr.charAt(i);

			if (exprCh >= 'A' && exprCh <= 'Z') {
				sb.append(exprCh);
			}

			else if (exprCh == '(') {
				stack.push(exprCh);
			}

			else if (exprCh == ')') {
				while (stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}

			else if (exprCh == '*') {
				while (!stack.isEmpty() && stack.peek() != '+' && stack.peek() != '-' && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.push(exprCh);
			}

			else if (exprCh == '/') {
				while (!stack.isEmpty() && stack.peek() != '+' && stack.peek() != '-' && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.push(exprCh);
			}

			else if (exprCh == '+') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.push(exprCh);
			}

			else if (exprCh == '-') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.push(exprCh);
			}

		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		String postFixExpr = sb.toString();

		System.out.print(postFixExpr);
	}// main
}