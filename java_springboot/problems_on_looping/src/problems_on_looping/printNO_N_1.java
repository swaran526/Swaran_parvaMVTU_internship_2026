package problems_on_looping;

import java.util.Scanner;

public class printNO_N_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int num = sc.nextInt();
		for (int i=num; i>=-5; i--) {
			System.out.println(i);

		}

	}
}
