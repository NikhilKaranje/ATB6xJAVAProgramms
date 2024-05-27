package May.exe20240518;

class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("Write Something...");
    }

    public void printColor(){
        System.out.println("Color of Pen is = " +this.color);
        //System.out.println("Color of Pen 2 is = " +this.color);
    }
}

class Student {
    String name;
    int age;
    String div;

    public void printStudentDetail() {
        System.out.println("Student Name is = " + this.name);
        System.out.println("Student Age is = " + this.age);
        System.out.println("Student Class is = " + this.div);
    }

    public Student(String div, int age, String name) { //Parameterized Constructor
        this.div = div;
        this.age = age;
        this.name = name;
    }
}
  public class OOPS{
      public static void main(String[] args) {

          Pen p1 = new Pen();

          p1.color = "blue";
          p1.type = "ink pen";

          Pen p2 = new Pen();
          p2.color = "red";
          p2.type = "gel pen";

          p1.write();
          p1.printColor();
          p2.printColor();


          Student s1 = new Student("a", 12, "Test");

          s1.name = "Nikhil";
          s1.age = 22;
          s1.div = "D";

           s1.printStudentDetail();

      }
    }


