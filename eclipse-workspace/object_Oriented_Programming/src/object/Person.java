package object;

public class Person {
	
   String name;
   double age;
   String  adress;
   String nationality;
   
   public Person() {
	   System.out.println("I am the superClass constructor");
	 }
   
    public Person (String n, double a , String ad, String nat) {
    	name=n;
    	age=a;
    	adress=ad;
    	nationality=nat;
     }
    
    
    public void setName(String n) {
    	name=n;
    }
    
    public void setAge(double a) {
    	age=a;
     }
    
    public void setAdress(String ad) {
    	adress=ad;
    }
    
    public void setNationality(String nat) {
    	nationality=nat;
    }
   
    
    
    public String getName() {
    	return name;
    }
    
    public double getAge() {
    	return age;
     }
    
    public String getAdress() {
    	return adress;
    }
    
    public String  getNationality() {
    	return nationality;
    }
    
    
    
    
    
	

}
