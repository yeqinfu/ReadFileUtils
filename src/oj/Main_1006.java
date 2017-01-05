package oj;

import java.util.Scanner;

public class Main_1006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double Vs=719/120.0;
		while (true) {
			int a=scanner.nextInt();
			if (a==-1) {
				break;
			}
			/**
			 * 如果把时针定住，分针和秒针都会有一个相对于时针的相对速度。
			 * 就以为时针不动了，分针和秒针在动。
			 * 输入a是代表三个指针的happy角度
			 * 当时针不动，分针在12小时内，可以相对于时针转动圈数为11
			 */
			for(int i=0;i<11;i++){//代表分针的每一圈
				/**
				 * 如果把时针和分针都看成不动只有秒针在动
				 * 秒针的相对速度变成扣掉分针速度，和时针速度
				 * 
				 * 
				 */
				
			}
			
		}
	}

}
