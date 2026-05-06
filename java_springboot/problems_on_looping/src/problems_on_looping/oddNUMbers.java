package problems_on_looping;

import java.util.Scanner;

public class oddNUMbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++){
			 if(i%2!=0)
			 System.out.println(i);
}
}
}
