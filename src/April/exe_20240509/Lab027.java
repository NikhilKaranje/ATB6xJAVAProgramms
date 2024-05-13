package April.exe_20240509;

import java.util.Scanner;

public class Lab027 {

        public static void main(String[] args) {

                System.out.println("Enter the numbers");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                if((n % 2 == 0) && (n >= 2 && n<= 5)){
                    System.out.println("Not Wierd");
                }else if ((n % 2 == 0) && (n >= 6 && n < 20)) {
                    System.out.println("Wierd");
                } else if((n % 2 == 0) && (n > 20)){
                    System.out.println("Not Wierd");
                }else {
                    System.out.println("Weird");
                }
        }
    }

