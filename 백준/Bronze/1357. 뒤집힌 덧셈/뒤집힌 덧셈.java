import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String X = sc.next();
		String Y = sc.next();
		sc.close();

		String RevX = "";
		String RevY = "";

		for (int i = X.length() - 1; i >= 0; i--) {
			RevX += X.charAt(i);
		}
		for (int i = Y.length() - 1; i >= 0; i--) {
			RevY += Y.charAt(i);
		}

		int total = 0;
		total = Integer.parseInt(RevX) + Integer.parseInt(RevY);

		String totalString = String.valueOf(total);

		String RevTotal = "";
		for (int i = totalString.length() - 1; i >= 0; i--) {
			RevTotal += totalString.charAt(i);
		}

		System.out.println(Integer.parseInt(RevTotal));
	}// main
}