package lab3_MariyaZinchenko;

import java.util.Random;

public class ContractFaculty extends lecturer{

	public int yearsOfServices;
	public int  ContractFacultyTeachers=0;
	public ContractFaculty (int age, double email){
		super(age, email);
		yearsOfServices = 0;
		 ContractFacultyTeachers++;
	}
	

	public double compStress(double emails) {
		Random rand = new Random();
		double stress = emails * (.999 *rand.nextDouble());
		System.out.println("This is my stress: "+stress+"  My emails are " +emails);
		return stress;
	}
	public double compRespect(int age, int eccentricities) {
		
		double respect = age +2* ContractFacultyTeachers;
		return respect;
		
	}
	public int incrementYearsOfService() {
		yearsOfServices++;
		return yearsOfServices;
	}
	
	
}
