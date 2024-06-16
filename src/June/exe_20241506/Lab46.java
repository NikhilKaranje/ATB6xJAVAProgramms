package June.exe_20241506;

import java.util.List;

public class Lab46 {

    //Collection framework --> List

    public static void main(String[] args) {
        List fruits = List.of("Orange", "Apple", "Banana", "Watermelon");

        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println("My Favorite fruit is = " + fruits.get(3));

        List myMarks = List.of(83, 55, 85, 93,21);
        System.out.println(myMarks);
        System.out.println(myMarks.size());
        System.out.println("Marks in Maths = "+ myMarks.get(3));

    }

}
