package functions1Java;

import java.util.Scanner;

public class sum0fDigits {
	public static int sumOfDigits(int num) {

        int sum = 0;

        while(num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = sc.nextInt();

        int result = sumOfDigits(num);

        System.out.println("Sum of digits: " + result);
    }
}

