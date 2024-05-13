package April.exe_20240423;

public class Lab007 {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(++a + ++a + a++);

        // part 1 --> ++a --> Expression = 11, value of a = 11
        // part 2 --> ++a --> Expression = 12, value of a = 12
        // part 3 --> a++ --> Expression = 12, value of a = 13
        //addition of expressions (11+12+12) =

        System.out.println(a);
    }
}
