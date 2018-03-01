package lab3_MariyaZinchenko;

public class Main {
	
	public static void main(String args[]) {
	
	universityTeacher professor = new professor(50, 10.00);
	universityTeacher lecturer = new lecturer(27, 4.00);
	universityTeacher gradStudent = new gradStudent(23, 2.00);
	universityTeacher ContractFaculty = new ContractFaculty(20, 2.00);
	
	University BU = new University();
	
	BU.add(gradStudent);
	BU.add(lecturer);
	BU.add(professor);
	BU.add(ContractFaculty);
	
	
	
	for (int i=1; i<=10; i++) {
		gradStudent.recieveMail(i*10+50);
		professor.recieveMail(i*10+50);
		lecturer.recieveMail(i*10+50);
		ContractFaculty.recieveMail(i*10+50);
	}

	
	
	System.out.println(BU);
	}
}
//getclassName()