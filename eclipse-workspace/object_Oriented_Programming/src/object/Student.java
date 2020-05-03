package object;



public class Student extends Person {
	
	
 int studyLevel;
 String specialization;
 double GPA;
 
 public Student() {
	 System.out.println("I am the subClass constructor");
	 
 }
 
 public Student (String n, double a, String ad, String nat, int lvl, String special, double gpa){
     super(n, gpa, ad, nat);  // invoking parent constructor
	 studyLevel=lvl;
	 specialization= special;
	 GPA=gpa;
	 
 } 
 public void setGPA(double GPA) {
	 this.GPA=GPA;
 }
 public void  steSpecialisation(String specialization) {
	 this.specialization=specialization;
 }

 public void setstudyLevel(int studyLevel  ){
	 this.studyLevel=studyLevel;
 }
 
 public double getGPA() {
	 return GPA;
 }
 
  public String getSpecialisation() {
	 return specialization;
 }
 
 public int  getStudyLevel() {
	 return studyLevel;
 }
 
//@Override  ---> called innotation 
 
	
}
