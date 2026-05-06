package problems_on_looping;

import java.util.Scanner;

public class sumOFfirstNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			
			sum+=i;
		}
			 System.out.println(sum);

}
}