import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] A = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		int M2 = sc.nextInt();
		int K = sc.nextInt();

		int[][] B = new int[M2][K];

		for (int i = 0; i < M2; i++) {
			for (int j = 0; j < K; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int C[][] = new int[N][K];

		for (int n = 0; n < N; n++) {
			for (int i = 0; i < K; i++) {
				for (int j = 0; j < M; j++) {
					C[n][i] += A[n][j] * B[j][i];
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}

	}// main
}