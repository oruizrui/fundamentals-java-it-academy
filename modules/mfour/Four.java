/* 

*/

package modules.mfour;

import java.util.Scanner; // import the Scanner class 

public class Four {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int monthAsString = 0;
        String message = "Invalid day";
        // Enter username and press Enter
        System.out.println("Could you give me a month, please? (1, 2, 3, etc.)");
        monthAsString = myScan.nextInt();
        myScan.close();

        message = switchCaseImpl(monthAsString, message);
        System.out.println(message);
    }

    private static String switchCaseImpl(Integer month, String message) {
        switch (month) {
        case 1:
            message = "January has 31 days";
            break;
        case 2:
            message = "February has 28 days";
            break;
        case 3:
            message = "March has 31 days";
            break;
        case 4:
            message = "April has 30 days";
            break;
        case 5:
            message = "May has 31 days";
            break;
        case 6:
            message = "June has 30 days";
            break;
        case 7:
            message = "July has 31 days";
            break;
        case 8:
            message = "August has 31 days";
            break;
        case 9:
            message = "September has 30 days";
            break;
        case 10:
            message = "October has 31 days";
            break;
        case 11:
            message = "November has 30 days";
            break;
        case 12:
            message = "December has 31 days";
            break;
        }

        return message;
    }
}
