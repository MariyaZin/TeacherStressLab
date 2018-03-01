package lab3_MariyaZinchenko;

import java.util.Random;

public class gradStudent extends universityTeacher {
	
	public double compStress(double emails){
		double stress = ((emails*1.5)<1500)?(emails*1.5):1500;
		return stress;
	}
	public void cope() {
		double number = 0.00;
		this.setEmails(number);
		
		Random rand = new Random();
		int pickedNumber = rand.nextInt(100) + 1;
		int myeccentricities = (pickedNumber > 80 ) ? ( (Math.random()<0.5) ? (getEccentricities()+3) : (getEccentricities()-3) ) : getEccentricities();
	
		System.out.println("AFTER: ");
		System.out.println(this.getClass().getSimpleName());
		System.out.println(" Stress level: "+ compStress(getEmails())+ ". Respect level: "+ compRespect(getAge(), myeccentricities));
	
		this.setEccentricities(myeccentricities);
	}
	public gradStudent(int age, double email) {
		super(age, email);
	}
}
