package April.exe_20240423;

public class Lab006 {
    public static void main(String[] args) {
        //Increment operator
        int a = 10;
        int b = ++a;

        System.out.println("value of a = " +a);
        System.out.println("value of b = " +b);

        System.out.println("---------->");

        int c = a++;

        System.out.println("value of a = " +a);
        System.out.println("value of b = " +b);
        System.out.println("value of c = " +c);

        System.out.println("----------->");

        int d = 10;

        System.out.println(++d + d++);
    }
}
