package April.exe_20240503;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {

        //Basic Info details


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name = ");
        String name = sc.nextLine();

        System.out.println("Enter your Age = ");
        int age = sc.nextInt();

        System.out.println("Enter your salary = ");
        double slr = sc.nextDouble();

        System.out.println("-----------------------");

        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
        System.out.println("Salary is "+slr);

    }
}
