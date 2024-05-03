package exe_20240503;
import java.util.Scanner;

public class Lab021 {
    public static void main(String[] args) {

        //Switch Case
        // User enter any number and will tell the day

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number = ");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Boring Monday!!");
                break;
            case 2:
                System.out.println("It's Tuesday!!");
                break;
            case 3:
                System.out.println("It's Wednesday!!");
                break;
            case 4:
                System.out.println("It's Thursday!!");
                break;
            case 5:
                System.out.println("It's Friday!!");
                break;
            case 6:
                System.out.println("Wow!! It's Saturday!!");
                break;
            case 7:
                System.out.println("Wohooo!!! It's Sunday!!!");
                break;
            default:
                System.out.println("Please enter a number b/w 1-7. Thanks! ");
        }
    }
}
