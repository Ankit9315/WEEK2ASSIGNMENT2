package assignment;

import java.util.Scanner;

public class digit {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=1000 && a<10000){
			System.out.println("NUMBER have 4 digit");
		}else {
			if(a>=100 && a<1000) {
				System.out.println("NUMBER have 3 digit");
		}else {
			if(a>=10 && a<100) {
				System.out.println("NUMBER have 2 digit");
		}else {if(a>=0 && a<10){
			System.out.println("NUMBER have 1 digit");
			}else {
				System.out.println("NUMBER have grater than 4 digit");
			}
			}
			}
		}
		}
}
