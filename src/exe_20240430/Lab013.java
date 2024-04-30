package exe_20240430;


import java.util.Scanner;

public class Lab013 {

    public static void main(String[] args) {

        // Maximum of 2 numbers
        // Taking inputs at realtime

        System.out.println("Enter Your number =");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter Your Number = ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("Maximum Number is = "+num1);
        }else {
            System.out.println("Maximum Number is = "+num2);
        }
    }

}