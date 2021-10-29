package examples.mfour.second;

import java.util.Scanner; // import the Scanner class 

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userAge = 0;

        // Enter username and press Enter
        System.out.println("Could you give me your age, please?");
        userAge = myObj.nextInt();
        myObj.close();

        System.out.println(messageForAge(userAge));
    }

    private static String messageForAge(int age) {
        String output = "";

        if (age <= 5) {
            output = "preescolar";
        } else if (age <= 11) {
            output = "primaria";
        } else if (age <= 16) {
            output = "ESO";
        } else {
            output = "FP o Universitat";
        }

        return output;
    }
}
