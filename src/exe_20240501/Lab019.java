package exe_20240501;


import java.util.Scanner;

public class Lab019 {
    public static void main(String[] args) {

        //Prime Number
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number = ");
        int num = sc.nextInt();
        sc.close();

        for(int i = 2; i <= num/2; i++){

            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num + " is a PRIME Number");
        }else {
            System.out.println(num + " is NOT a PRIME number");
        }
    }
}