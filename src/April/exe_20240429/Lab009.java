package April.exe_20240429;

public class Lab009 {
    public static void main(String[] args) {

        //Max Min number with Ternary operator
        int a = 10;
        int b = 20;
        int c = 30;

        int max = a < b  ? b : a ;
        int min = a < b ? a : b ;

        System.out.println("Max number is = "+ max);
        System.out.println("Min number is = "+ min);

        //Three numbers max -

        int max1 = (a>b && a>c) ? a: (b>a && b>c) ? b: c ;
        int min1 = (a<b && a<c) ? a: (b<a && b<c) ? b:c ;

        System.out.println("Largest Number is "+ max1);
        System.out.println("Smallest number is "+ min1);
    }
}
