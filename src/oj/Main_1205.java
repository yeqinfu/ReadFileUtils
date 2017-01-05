package oj;

import java.util.Scanner;

public class Main_1205 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long n = scanner.nextInt();
			long sum = 0;
			long max = 0;
			for (int i = 0; i < n; i++) {
				long a = scanner.nextInt();
				sum += a;
				if (a > max) {
					max = a;
				}
			}
			sum=sum+1-max;
			if (sum>=max) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}
}
