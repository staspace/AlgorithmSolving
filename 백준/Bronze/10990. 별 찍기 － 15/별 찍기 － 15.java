import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		for (int i = 1; i <= N; i++) {

			if (i == 1) {
				for (int j = N - 1; j >= i; j--) {
					System.out.print(" ");
				}
				System.out.println("*");
			}

			else {
				for (int j = N - 1; j >= i; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = 1; j < 2 * i - 2; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}

		}
	}// main
}