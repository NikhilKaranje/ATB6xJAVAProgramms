package May.exe_20240516;

import java.util.Scanner;

public class Lab035 {

    public static void main(String[] args) {

        //Functions
        //Addition program

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a = ");
        int a = sc.nextInt();
        System.out.println("Enter numebr b = ");
        int b = sc.nextInt();

        int sum = sumOfNumbers(a, b);
        System.out.println("Sum is = " +sum);

    }

    static int sumOfNumbers(int a, int b) {

       int sum = a+b;
       return sum;
    }
}
