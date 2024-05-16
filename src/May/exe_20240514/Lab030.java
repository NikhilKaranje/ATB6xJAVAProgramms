package May.exe_20240514;

public class Lab030 {
    public static void main(String[] args) {

        //Array
        //Integer Array =
        int[] array = new int[5];
        int[] age = {33,44,31,32,39};

        System.out.println(array.length);
        System.out.println(age[0]);
        System.out.println(age[2]);

        System.out.println("-----------------------");

        for(int i =-0; i< age.length; i++){
            System.out.println("Your age is = " +age[i]);
        }

        System.out.println("------------------------");
        //Sting

        String[] myClass = {"test1","test2","test3"};

        System.out.println(myClass.length);
        System.out.println(myClass[2]);
    }
}
