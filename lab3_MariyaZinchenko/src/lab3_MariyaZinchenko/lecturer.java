package lab3_MariyaZinchenko;

public class lecturer extends universityTeacher {

	public lecturer(int age, double email) {
		super(age, email);
	}
	
	public void cope() {
		double number = getEmails();
		if( number > 0.00) {
			number = getEmails()-(getEmails()*.6);
		}
		else {number = 0.00;}
		System.out.println("AFTER: ");
		System.out.println(this.getClass().getSimpleName()); 
		System.out.println("Stress level: "+ compStress(number)+". Respect level: "+ compRespect(getAge(), getEccentricities()));
	
		this.setEmails(number);
	}
	
}
