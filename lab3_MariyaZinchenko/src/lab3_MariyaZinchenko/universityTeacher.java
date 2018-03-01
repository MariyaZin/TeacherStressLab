package lab3_MariyaZinchenko;
import java.util.Random; 

public abstract class universityTeacher {
	
	
	private double emails;
	private int age;
	private int eccentricities = 0;
	private Boolean happy;

	
	
	public universityTeacher(int age, double email) {
		
		this.age = age;
		this.emails = email;
		
	}
	
	
	public void recieveMail(double myemails) {
		double OLDemails = emails;
		emails += myemails; 
		setEmails(emails);
		Random rand = new Random();
		int pickedNumber = rand.nextInt(100) + 1;
		int OLDecentricities = eccentricities;
		eccentricities = (pickedNumber > 80 ) ? ( (Math.random()<0.5) ? (eccentricities+2) : (eccentricities-2) ) : eccentricities;
		System.out.println("Respect: "+compRespect(age, eccentricities));
		happy = compStress(emails) < compRespect(age, eccentricities);
		if(happy!=true) {
			System.out.println();
			System.out.println("BEFORE:");
			System.out.println(this.getClass().getSimpleName());
			System.out.println("Stress level: "+ compStress(OLDemails)+ " Respect level: "+ compRespect(age, OLDecentricities));
			System.out.println("COPING"); 
			this.cope();}

	}
	public double compStress(double emails) {
		double stress = (emails<1000)?emails:1000;
		//System.out.println("This is my stress: "+stress+"  My emails are " +emails);
		return stress;
	}
	public double compRespect(int age, int eccentricities) {
		
		double respect = age - eccentricities;
		respect = (respect>= 0)?respect:0;
		return respect;
		
	}
	public int getAge() {
		return age;
	}
	public void setEmails(double number){
		emails = number;
	}
	public void setEccentricities(int number){
		eccentricities = number;
	}
	public int getEccentricities() {
		return eccentricities;
	}
	public double getEmails() {
		return emails;
	}
	public void cope() {
		
	}
	public String toString() {
		String s = new String();
		s = "My email: "+ emails + " My age: " + age + " ";
	return s;
	}
}
