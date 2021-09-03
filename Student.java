package org.Student;

import org.department.DepartMent;

public class Student extends DepartMent {
	
		public void studentName(String name) {
			System.out.println("The name of the student is: "+ name);
		}
		public void studentDept(String name, String dept) {
			System.out.println("The department of the student "+ name +" "+"is : "+ dept);
		}
		public void studentId(String name, int id) {
			System.out.println("The department of the student "+ name +" "+"is :"+ id);
		}

		public static void main(String[] args) {
			Student studentdetails=new Student();
			System.out.println("------->Inherting College_Assign package and its class");
			studentdetails.collegeName();
			studentdetails.collegeCode();
			studentdetails.collegeRank();
			System.out.println("------>Inherting Department package and its class--->This is single inheritance");
			studentdetails.deptName();
			System.out.println("--->Inherting Student package and its class---->This is multi level inheritance");
			studentdetails.studentName("Kowsalya");
			studentdetails.studentDept("Kowsalya", "ComputerScience");
			studentdetails.studentId("Kowsalya", 6104);
			System.out.println("Executed");
		}

	}

