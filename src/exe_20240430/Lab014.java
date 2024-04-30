package exe_20240430;

import java.util.Scanner;

public class Lab014 {
    public static void main(String[] args) {
        //Print Grade
        // A: 90 - 100
        // B: 75 - 89
        // C: 60 - 74
        // D: 35 - 59
        // F: 0 - 34

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Score!! ");
        int scr = sc.nextInt();

        if(scr >= 90 && scr <= 100){
            System.out.println("Congratulations!! Your Grade is A");
        }else if (scr >=75 && scr <= 89){
            System.out.println("Your Grade is B");
        }else if (scr >= 60 && scr <= 74){
            System.out.println("Your Grade is C");
        }else if (scr >= 35 && scr <= 59){
            System.out.println("Your Grade is D");
        }else {
            System.out.println("You have FAILED!!!");
        }
    }
}
