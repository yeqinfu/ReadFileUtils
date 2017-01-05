package oj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_1004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}
			Map<String,Integer> map=new HashMap<String, Integer>();
			scanner.nextLine();
			for (int j = 0; j < n; j++) {
				String color=scanner.nextLine();
				if (map.containsKey(color)) {
					int m=map.get(color);
					m++;
					map.put(color, m);
				}else{
					map.put(color, 1);
				}
				
			}
			int max=0;
			String maxString="";
			  
			for (Map.Entry<String,Integer> entry : map.entrySet()) {  
			    if (entry.getValue()>max) {
			    	  max=entry.getValue();
			    	  maxString=entry.getKey();
				}
			} 
			System.out.println(maxString);
		}

	}

}
