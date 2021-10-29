package examples.first;

import java.util.Scanner; // import the Scanner class 

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName = "";
        String userAge = "";

        // Enter username and press Enter
        System.out.println("Could you give me your name and first name, please?");
        userName = myObj.nextLine();

        System.out.println("Could you give me your age, please?");
        userAge = myObj.nextLine();

        System.out.println("Name is: " + userName);
        System.out.println("Age is: " + userAge);
    }
}