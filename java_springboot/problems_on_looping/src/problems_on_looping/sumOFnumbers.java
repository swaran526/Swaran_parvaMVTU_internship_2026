package problems_on_looping;

import java.util.Scanner;

public class sumOFnumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int num=sc.nextInt();
	int i=1;
	int res=0;
	while(i<=num) {
		res=res+i;
		i++;
	}
	System.out.println("result is :"+res);
}
}
