package May.exe20240527;

public class OopsConcepts {
    public static void main(String[] args) {

        //Super and This keyword

            Car c = new Car();
            c.display();

    }
}

 class Car extends Vehicle{
    int maxSpeed = 200;
    void display(){
        System.out.println("Max speed of vehicle is  = " + super.maxSpeed); //Super used to access parent variable
        System.out.println("Max speed of Car is = " + this.maxSpeed);  //This used to access own class variable
    }

 }

 class Vehicle{

    int maxSpeed = 100;

    void message(){
        System.out.println("This is vehicle class = ");
    }
 }

