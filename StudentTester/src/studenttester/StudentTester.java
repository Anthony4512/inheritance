/*
    This is a lab for chapter 8 of the Java zybook

*/


package studenttester;

public class StudentTester {
    
    public static void prettyPrint(Person person) {
        System.out.println("-----PERSON-----");
        person.printInfo();
        System.out.println("----------------------");
    }
    
    public static void prettyPrint(Student student) {
        System.out.println("-----STUDENT-----");
        student.printInfo();
        System.out.println("----------------------");
    }
    

    public static void main(String[] args) {
        Person p = new Person("Joe Anderson", 19);
        p.setName("jordan");
        p.setAge(20);
        p.getAge();
        p.getName();
        
        
        Student s1 = new Student("Anthony Mirely", 30);
        Student s2 = new Student("Rhaida Shephard", 54, 3.5);
        
        s2.setName("maxwell");
        s2.setGPA(2.9);
        s2.setAge(34);
        s2.getAge();
        s2.getName();
        s2.getGPA();
        s2.getID();
        
        prettyPrint(p);
        prettyPrint(s1);
        prettyPrint(s2);
        
    }
    
}
