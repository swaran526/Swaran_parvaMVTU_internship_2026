package arrays_strings_java;

import java.util.Scanner;

public class arrays2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size =sc.nextInt();
		int arr[]=new int [size];
		int i=0;
		while(i<=size-1) {
			System.out.println("enter "+ i +"element:");
		arr[i]=sc.nextInt();
		i++;
	}
	for(int j=0; j<=size-1;j++) {
		System.out.print(arr[j]+"");
	}
	
}
}
