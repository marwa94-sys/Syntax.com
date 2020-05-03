package object;

public abstract  class Employee  extends Person {
	
   double salary;
    String bank;
    String job;
    public Employee(String n,double a, String ad, String nat,double str,String b,String J) {
    	super(n,a,ad,nat);
    	salary=str;
    	bank=b;
    	job=J;
    }
    
    public void  setSalary(double S) {
    	salary=S;
    }
    public void steBank(String B) {
    	bank=B;
    }
    public void steJob(String J) {
    	job=J;
    }
    
    
    
    public double getSalary() {   //----> called prototype
    	return salary;
    }
    public String getBank() {
    	return bank;
    }
    public String getJob() {
         return job;
    } 
    
    
	
	

}