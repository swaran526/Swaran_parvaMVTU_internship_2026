package loopingstatements;

import java.util.Scanner;

public class DoWhileLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("enter the number :");
	int count =sc.nextInt();
	int i=1;
	do{
		System.out.println("count:"+i);
		i++;
	}while(i<=count);
}
}
