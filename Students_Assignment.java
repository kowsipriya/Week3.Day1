package Week3.Day1;

public class Students_Assignment {
		void getStudentInfo(int id) {
			System.out.println("getStudentInfo with id is : "+ id);
		}
		void getStudentInfo(int id,String name) {
			System.out.println("getStudentInfo with id "+ id +" and name is : "+ name);
		}
		void getStudentInfo(String email,long phoneNumber) {
			System.out.println("getStudentInfo with email as "+ email +" and phonenumber is : "+ phoneNumber);
		}
		public static void main(String[] args) {
			Students_Assignment getdetails=new Students_Assignment();
			getdetails.getStudentInfo(876543);
			getdetails.getStudentInfo(876543, "Kowsipriya");
			getdetails.getStudentInfo("kowpri@gmail.com", 963987632);
		}

	}
