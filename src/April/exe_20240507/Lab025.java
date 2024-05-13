package April.exe_20240507;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {

        // Take input from user and ask the for any arithmetic operation

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1 = ");
        int inp1 = sc.nextInt();

        System.out.println("Input 2 = ");
        int inp2 = sc.nextInt();

        System.out.println("What action you want to perform = ");
        char result = sc.next().charAt(0);

        switch (result){
            case '+':
                System.out.println("Result is " +(inp1 + inp2));
                break;
            case '-':
                System.out.println("Result is " +(inp1 - inp2));
                break;
            case '/':
                System.out.println("Result is " +(inp1/inp2));
                break;
            case '*':
                System.out.println("Result is " +(inp1 * inp2));
                break;
            default:
                System.out.println("Please enter valid Arithmetic operation");
        }
    }
}
