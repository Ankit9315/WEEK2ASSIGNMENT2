package assignment;

import java.util.Scanner;

public class factorialofanumber {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a;
		char ch;
		do {
			a=sc.nextInt();
			int i=1;
			int b=1;
			while(b<=a) {
				i=i*b;
				b++;
			}
			System.out.println(i);
			System.out.println("Do you want to continue (Y/N)");
			ch=sc.next().charAt(0);
		}while(ch=='Y');
}
}
