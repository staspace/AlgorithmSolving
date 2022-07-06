import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		sc.close();
		char[] ch = s.toCharArray();
		String[] ans = s.split("");
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				result += ans[i].toUpperCase();
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				result += ans[i].toLowerCase();
			}
		}

		System.out.println(result);

	}// main

}
