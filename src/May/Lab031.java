package May;

public class Lab031 {
    public static void main(String[] args) {

        //Double the Array

        int[] salaries = {100,250,220, 30,490};

        for(int i=0; i< salaries.length; i++){
            System.out.println("Your salary was = "+ salaries[i]+ "K");
            System.out.println("--> After appraisal = "+ salaries[i]*2+"K");
        }
    }
}
