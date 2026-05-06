package problems_on_looping;

import java.util.Scanner;

public class sumofEven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=sc.nextInt();
	int i=0;
	int res=0;
    while(i<=num) {
    	if(i%2==0)
    	res=res+i;
    	i++;	
    }
    System.out.println("result is:"+res);
}
}
