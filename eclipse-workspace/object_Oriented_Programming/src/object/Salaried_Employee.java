package object;

public class Salaried_Employee extends Employee {

	double bonus;
	double deduction;
	
	
	public Salaried_Employee(String n, double a, String ad, String nat, double str, String b,String j, double bon,double d) {
		super(n,a,ad,nat,str,b,j);
		bonus=bon;
		deduction=d;
		
	}
	@Override
	public double getSalary() {
		return salary+bonus-deduction;
	
	}
	
	
	public static void main(String[] args) {
		Salaried_Employee obj2=new Salaried_Employee("Marwa", 12.34, "Yaghour", "Morrocan", 56.8, "Management", "Inchaalah", 238.34, 200);
	
	
}
}