package oj;

import java.util.Scanner;

public class Main_1021 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a=scanner.nextInt();
			if (a%4==2) {
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			
		}
		
	}
	public static int fun(int n){
		if (n==0) {
			return 7;
		}else if (n==1) {
			return 11;
		}else {
			return fun(n-1)+fun(n-2);
		}
	}

}
