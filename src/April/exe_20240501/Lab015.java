package April.exe_20240501;

import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {

        //Positive, Negative or Zero number

        System.out.println("Enter the number = ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Number is a Positive Number");
        }else if(num < 0){
            System.out.println("Number is a Negative Number");
        }else {
            System.out.println("Number is ZERO");
        }
    }
}
