package com.calss_object;

public class student {
		String std_name;
		int std_usn;
		String std_email;
		
		public String isworking() {
			return "Yes he is working";
		}
		public static void main(String[] args) {
			student std=new student();
			std.std_name="swaran";
			std.std_usn=121;
			std.std_email="swran@parvam.com";
			String res=std.isworking();
			System.out.println("std_name:"+std.std_name);
			System.out.println("std_usn:"+std.std_usn);
			System.out.println("std_email:"+std.std_email);
			System.out.println(res);
			
			student std1=new student();
			std1.std_name="swaran";
			std1.std_usn=121;
			std1.std_email="swran@parvam.com";
			String res1=std1.isworking();
			System.out.println("std_name:"+std1.std_name);
			System.out.println("std_usn:"+std1.std_usn);
			System.out.println("std_email:"+std1.std_email);
			System.out.println(res1);

}

}
