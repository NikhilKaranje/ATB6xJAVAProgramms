package exe_20240501;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {

        //Largest of 3 Numbers

        System.out.println("Enter Your Number = ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Largest Number is = " +num1);
        }else if(num2 >= num1 && num2 >= num3 ){
            System.out.println("Largest Number is = " +num2);
        }else {
            System.out.println("Largest Number is = " +num3);
        }
    }
}
