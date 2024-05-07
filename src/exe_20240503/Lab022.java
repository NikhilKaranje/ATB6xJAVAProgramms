package exe_20240503;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {

        //Vowel or consonant using switch case

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character = ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        switch (ch){
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }
}
