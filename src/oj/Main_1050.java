package oj;

import java.util.Scanner;

public class Main_1050 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long n = scanner.nextInt();
			int[] a = new int[200];
			for (int i = 0; i < n; i++) {
				int s = scanner.nextInt();
				int e = scanner.nextInt();
				s=(s-1)/2;
				e=(e-1)/2;
				if (e<s) {
					int temp=e;
					e=s;
					s=temp;
				}
				for (int j = s; j <=e; j++) {
					a[j] += 1;
				}
			}
			int min = a[0];
			for (int i = 0; i < a.length; i++) {
				if (a[i] > min) {
					min = a[i];
				}
			}
			System.out.println(min*10);

		}
	}
}
