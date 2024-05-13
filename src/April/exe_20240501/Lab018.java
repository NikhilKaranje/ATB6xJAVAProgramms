package April.exe_20240501;

import java.util.Scanner;

public class Lab018 {
    public static void main(String[] args) {

        //Leap Year
        System.out.println("Enter the Year = ");
        Scanner sc = new Scanner(System.in);

        int yr = sc.nextInt();

        if(yr % 4 == 0){
            System.out.println(yr + " is a Leap Year");
        }else {
            System.out.println(yr + " is NOT a Leap Year");
        }
    }
}
