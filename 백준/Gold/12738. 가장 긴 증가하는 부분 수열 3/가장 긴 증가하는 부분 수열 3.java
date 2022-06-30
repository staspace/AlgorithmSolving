import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		list.add(-1000000001);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int value = sc.nextInt();

			if (list.get(list.size() - 1) < value) {
				list.add(value);
			} else {
				int low = 0;
				int high = list.size() - 1;

				while (low < high) {
					int mid = (low + high) / 2;
					if (list.get(mid) < value) {
						low = mid + 1;
					} else {
						high = mid;
					}
				} // end of while

				list.set(high, value);
			}
		} // end of for

		sc.close();
		System.out.print(list.size() - 1);
	}// main
}