package exe_20240509;

import java.util.Scanner;

public class Lab028 {
    public static void main(String[] args) {

        //Factorial Program
        //1! = 1
        //2! = 2*1 = 2
        //3! = 3*2*1 = 6
        //4! = 4*3*2*1 = 24


        System.out.println("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long fact = 1;
        
        for (int i = 1; i <= num; i++){

            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
