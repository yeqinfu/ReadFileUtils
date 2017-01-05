package oj;

import java.util.Scanner;

public class Main_2035 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			if (a==0&&b==0) {
				break;
			}
			int result=fun(a,b);
			System.out.println(result);
			
		}

	}

	private static int fun(int a, int b) {
		a=a%1000;
		b=b%1000;
		int result;
		if (b==0) {
			result=1;
		}else{
			result=fun(a*a, b/2);
			if (b%2==1) {
				result*=a;
			}
		}
		return result%1000;
	}

}
