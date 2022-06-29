import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char[] postfix = sc.next().toCharArray();

		Stack<Double> stack = new Stack<>();
		Map<Character, Double> map = new HashMap<>();

		char key = 'A';
		for (int i = 0; i < N; i++) {
			map.put(key, sc.nextDouble());
			key++;
		}

		sc.close();

		for (int i = 0; i < postfix.length; i++) {
			if (postfix[i] >= 'A' && postfix[i] <= 'Z') {
				stack.push(map.get(postfix[i]));
			}

			else {
				double operand1 = stack.pop();
				double operand2 = stack.pop();

				switch (postfix[i]) {
				case '*':
					stack.push(operand2 * operand1);
					break;
				case '/':
					stack.push(operand2 / operand1);
					break;
				case '+':
					stack.push(operand2 + operand1);
					break;
				case '-':
					stack.push(operand2 - operand1);
					break;
				}
			}
		} // end of for문

		double ans = stack.pop();
		System.out.printf("%.2f", ans);

	}// main
}