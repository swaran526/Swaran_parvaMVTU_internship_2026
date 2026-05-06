package problems_on_looping;

import java.util.Scanner;

public class power_of_num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a base number:");
	int base=sc.nextInt();
	System.out.println("enter a power:");
	int power=sc.nextInt();
	int result=1;
	for(int i=1;i<=power;i++){
	 result*=base;
	}
	System.out.println(result);
}
}
