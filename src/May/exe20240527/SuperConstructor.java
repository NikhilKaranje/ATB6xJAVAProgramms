package May.exe20240527;

public class SuperConstructor {
    public static void main(String[] args) {

        Student s1 = new Student();

    }
}

 class Person{
    Person(){
        System.out.println("Person - Default constructor");
    }
 }

 class Student extends Person{
    Student(){
        System.out.println("Student - Default constructor");
    }
 }
