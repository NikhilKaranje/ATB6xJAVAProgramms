package exe_20240501;

import java.util.Scanner;

public class Lab017 {
    public static void main(String[] args) {

        //Check char is vowel, consonant

        System.out.println("Enter a Character = ");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
        || ch=='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Entered character is a VOWEL");
        }else {
            System.out.println("Entered character is a CONSONANT");
        }
    }
}
