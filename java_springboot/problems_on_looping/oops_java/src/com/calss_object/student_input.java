package com.calss_object;

import java.util.Scanner;

public class student_input {
			String std_name;
			int std_usn;
			String std_email;
			
			public String isworking() {
				return "Yes he is working";
			}
			public static void main(String[] args) {
				System.out.println("enter the data of std1:");
				
				student_input std=new student_input();
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the name:");
				std.std_name=sc.nextLine();
				
				System.out.println("enter the usn:");
				std.std_usn=sc.nextInt();
				
				System.out.println("enter the email:");
				std.std_email=sc.nextLine();
				
				System.out.println("is student present");
							
				String res=std.isworking();
				System.out.println("std_name:"+std.std_name);
				System.out.println("std_usn:"+std.std_usn);
				System.out.println("std_email:"+std.std_email);
				System.out.println(res);
				
//				student_input std1=new student_input();
//				std1.std_name="swaran";
//				std1.std_usn=121;
//				std1.std_email="swran@parvam.com";
//				String res1=std1.isworking();
//				System.out.println("std_name:"+std1.std_name);
//				System.out.println("std_usn:"+std1.std_usn);
//				System.out.println("std_email:"+std1.std_email);
//				System.out.println(res1);

	}

	}


