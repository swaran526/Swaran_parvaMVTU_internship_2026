package com.calss_object;

public class employe {
		String emp_name;
		int emp_id;
		String emp_email;
		
		public String isworking() {
			return "Yes he is working";
		}
		public static void main(String[] args) {
			employe emp=new employe();
			emp.emp_name="mohan";
			emp.emp_id=121;
			emp.emp_email="mohan@parvam.com";
			String res=emp.isworking();
			System.out.println("emp_name:"+emp.emp_name);
			System.out.println("emp_id:"+emp.emp_id);
			System.out.println("emp_email:"+emp.emp_email);
			System.out.println(res);
			
			employe emp1=new employe();
			emp1.emp_name="loki";
			emp1.emp_id=100;
			emp1.emp_email="loki@parvam.com";
			String res1=emp.isworking();
			System.out.println("emp_name:"+emp1.emp_name);
			System.out.println("emp_id:"+emp1.emp_id);
			System.out.println("emp_email:"+emp1.emp_email);
			System.out.println(res1);
			
			
		}
		}

