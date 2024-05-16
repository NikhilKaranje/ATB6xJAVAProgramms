package May.exe_20240514;

import java.util.Scanner;

public class Lab033 {

    public static void main(String[] args) {

        //Array program
        //Max Salary


        Scanner sc = new Scanner(System.in);
        int[] salary = new int[4];

        System.out.println("Enter your salary = ");
        salary[0] = sc.nextInt();
        System.out.println("Enter your salary = ");
        salary[1] = sc.nextInt();
        System.out.println("Enter your salary = ");
        salary[2] = sc.nextInt();
        System.out.println("Enter your salary = ");
        salary[3] = sc.nextInt();

        int max = 0;
        for (int j : salary) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Max salary is = " +max);

    }
}
