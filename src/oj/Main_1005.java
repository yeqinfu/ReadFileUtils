package oj;

import java.util.Scanner;

public class Main_1005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int n=scanner.nextInt();
			if (a==0&&b==0&&n==0) {
				break;
			}else{
				
				System.out.println(fun(a,b,n%49));
			}
			
		}

	}
	
	private static int fun(int a,int b,int n){
		if (n==1) {
			return 1;
		}else if (n==2) {
			return 1;
		}else {
			return (a*fun(a, b, n-1)+b*fun(a, b, n-2))%7;
		}
	}

}
