package arrays_strings_java;

import java.util.Scanner;

public class array4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int [][]arr =new int [2][3];
	System.out.println("enter the elemets:");
	for( int i=0;i<=1;i++) {
		for(int j=0;j<=2;j++) {
			System.out.println(" enter ["+i+"]["+j+"]ele:");
					arr[i][j]=sc.nextInt();
		}
	}
	for( int i=0;i<=1;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}

}
}
