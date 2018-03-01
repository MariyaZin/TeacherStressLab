package lab3_MariyaZinchenko;

import java.util.ArrayList;

public class University {

	private ArrayList<universityTeacher> obj ;
	

	public University() {
		obj = new ArrayList<universityTeacher>(30);
	}
	
	
	public void add(universityTeacher myTeacher) {
		obj.add(myTeacher);
	}
	
	public void sendThemMail(int numberOfEmails) {
		for (int i=0; i<obj.size(); i++) {
			obj.get(i).recieveMail(numberOfEmails);
		}
	}
	
	public String toString() {
		System.out.println();
		String sObj = new String();
		sObj = " ";
			for(int i=0; i<obj.size(); i++) {
				sObj += obj.get(i).getClass().getSimpleName()+ " " + obj.get(i).toString() +" | ";
			
			}
		return sObj;	
	}
	
	public void incrementYearsOfServiceOfContractFacultyTeachers() {
		for(universityTeacher teacher : obj) {
			if (teacher instanceof ContractFaculty) {
				((ContractFaculty) teacher).incrementYearsOfService();
			}
		}
	}
		
}
