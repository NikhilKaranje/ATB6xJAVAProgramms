package exe_20240501;

import java.util.Scanner;

public class Lab020 {
    public static void main(String[] args) {

        //FizzBuzz Test
        //Write a program that prints numbers from 1 to 100.
        // For multiples of 3, print "Fizz" instead of the number,
        // For multiples of 5, print "Buzz." instead of number,
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for FizzBuzz Test");
        int num = sc.nextInt();
        sc.close();

        System.out.println("FizzBuzz Test till " +num);

        for(int i = 1; i<= num; i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i +"");
            }
        }
    }
}
