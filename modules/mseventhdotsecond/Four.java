/* 
(M7.1.) Exercici 4

L’usuari ha d’introduir dos números, el programa retornarà “Un dels dos números és negatiu”, només si un dels dos números és negatiu.
*/

package modules.mseventhdotsecond;

import java.util.Scanner; // import the Scanner class 

public class Four {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Could you give me a number?");
        firstNumber = myScan.nextInt();
        System.out.println("Could you give me a another?");
        secondNumber = myScan.nextInt();
        myScan.close();

        if (justOneNegative(firstNumber, secondNumber) || justOneNegative(secondNumber, firstNumber)) {
            System.out.println("one of them is negative");
        }

        System.out.println("thanks!");
    }

    private static Boolean justOneNegative(int first, int second) {
        return (first < 0 && second >= 0);
    }
}
