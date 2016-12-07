
package studenttester;

public class Student extends Person{
    
    private int ID;
    private double GPA;
    
        
    public Student(String name, int age) {
        super(name, age);
        this.GPA = 4.0;
    }   
    
    
    public Student(String name, int age, double GPA) {
       super(name, age);
       if(GPA <=4.0 && GPA >= 0) {
           this.GPA = GPA;
       }
       
    }

    public int getID() {
        return ID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        if(GPA <=4.0 && GPA >= 0.0) {
           this.GPA = GPA;
       }
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("GPA: " + this.GPA);
        System.out.println("ID: " + this.ID);
    }
    
    

       
}
