package examples.mfour.four;

import java.util.Scanner; // import the Scanner class 

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int monthAsString = 0;
        String message = "Invalid day";
        // Enter username and press Enter
        System.out.println("Could you give me a month, please? (1, 2, 3, etc.)");
        monthAsString = myObj.nextInt();
        myObj.close();

        message = switchCaseImpl(monthAsString, message);
        System.out.println(message);
    }

    private static String switchCaseImpl(Integer month, String message) {
        switch (month) {
        case 1:
            message = "January 31 days";
            break;
        case 2:
            message = "February 28 days";
            break;
        case 3:
            message = "March 31 days";
            break;
        case 4:
            message = "April 30 days";
            break;
        case 5:
            message = "May 31 days";
            break;
        case 6:
            message = "June 30 days";
            break;
        case 7:
            message = "July 31 days";
            break;
        case 8:
            message = "August 31 days";
            break;
        case 9:
            message = "September 30 days";
            break;
        case 10:
            message = "October 31 days";
            break;
        case 11:
            message = "November 30 days";
            break;
        case 12:
            message = "December 31 days";
            break;
        }

        return message;
    }
}
