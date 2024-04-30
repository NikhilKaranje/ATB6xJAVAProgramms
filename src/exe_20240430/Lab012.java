package exe_20240430;

import java.util.Scanner;

public class Lab012 {
    public static void main(String[] args) {

        // Even Odd Number program
        //Taking input from the user

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number = ");

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
        sc.close();
    }
}
