import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int p = fs.nextInt(), q = fs.nextInt();
			p += q + 1;
			// 1 2 3 4 5 6 7 8 9 10
			// A A B B A A B B A A
			if (p % 4 == 3 || p % 4 == 0) {
				System.out.println("Bob");
			} else {
				System.out.println("Alice");
			}
		}
		fs.close();
	}
}
