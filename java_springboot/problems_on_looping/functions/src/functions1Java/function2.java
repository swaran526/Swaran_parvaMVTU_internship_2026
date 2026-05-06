package functions1Java;

import java.util.Scanner;

public class function2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter two numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	int res =mul(num1,num2);
	System.out.println("mul:"+res);
	
	int res1=newClass.div(num1,num2);
	System.out.println("div:"+res1);
}
public static int mul(int a,int b) {
	return a*b;
	
}
}
class newClass{
	public static int div(int a,int b) {
		return a/b;
	}
}