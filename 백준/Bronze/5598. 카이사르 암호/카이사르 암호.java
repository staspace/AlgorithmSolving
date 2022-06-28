import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		char[] GJC = sc.next().toCharArray();
		sc.close();

		for (int i = 0; i < GJC.length; i++) {
			if (GJC[i] - 3 < 'A') {
				GJC[i] += 23;
			} else {
				GJC[i] -= 3;
			}
		}

		for (char origin : GJC) {
			sb.append(origin);
		}

		System.out.println(sb);
	}// main
}