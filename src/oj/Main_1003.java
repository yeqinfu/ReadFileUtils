package oj;

import java.util.Scanner;

public class Main_1003 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		for(int i=0;i<t;i++){
			int n=scanner.nextInt();
			int max=-1001;
			int start=0;
			int end=0;
			int sum=0;
			int l=0;
			for(int j=0;j<n;j++){
				int a=scanner.nextInt();
				sum+=a;
				if (max<sum) {
					max=sum;
					start=l;
					end=j;
				}
				if (sum<0) {
					sum=0;
					l=j+1;
				}
			}
			System.out.println("Case "+(i+1)+":");
			System.out.println(max+" "+(start+1)+" "+(end+1));
			if (i!=t-1) {
				System.out.println();
			}
			
		}

	}

}
