package lab3_MariyaZinchenko;

public class professor extends universityTeacher {

	public professor(int age, double email) {
		super(age, email);
	}
	
	public void cope() {
		int myeccentricities = getEccentricities()+30;
		
	
		System.out.println("AFTER: ");
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Stress level: "+ compStress(getEmails())+ ". Respect level: "+ compRespect(getAge(),myeccentricities));
	
		
		this.setEccentricities(myeccentricities);
		
	}
	
}

