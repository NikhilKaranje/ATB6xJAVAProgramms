package May.exe_20240514;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {
        //Using Array
        //Enter marks
        //Find failed subject

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[3];
        System.out.println("Enter marks for Sub1 = ");
        marks[0] = sc.nextFloat();
        System.out.println("Enter marks for Sub 2 = ");
        marks[1] = sc.nextFloat();
        System.out.println("Enter marks for Sub 3 = ");
        marks[2] = sc.nextFloat();

        for(int i = 0; i< marks.length; i++){
            if (marks[i]<= 34){
                System.out.println("Failed in subject "+ marks[i]);
            }else {
                System.out.println("Marks are = " +marks[i]);
            }
        }
    }
}
