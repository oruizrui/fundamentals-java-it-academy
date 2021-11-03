/* 
(M5) Exercici 2

El programa demana dos números enters i llavors calcula la suma dels valors compresos entre els dos números, inclosos. 

Exemple: 4 i 6  --> resultat = 4 + 5 + 6 = 15
*/

package modules.mfifth;

import java.util.ArrayList;
import java.util.Scanner; // import the Scanner class 
import java.util.stream.Collectors;

public class Second {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Integer firstNumber = 0;
        Integer secondNumber = 1;
        String str = "";
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> stringNumbers = new ArrayList<String>();
        Integer numbersSum = 1;

        System.out.println("Could you give me a number?");
        firstNumber = myScan.nextInt();
        System.out.println("Could you give me a another?");
        secondNumber = myScan.nextInt();
        myScan.close();

        if (firstNumber <= secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                numbers.add(i);
            }
        } else if (firstNumber > secondNumber) {
            for (int i = firstNumber; i >= secondNumber; i--) {
                numbers.add(i);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            stringNumbers.add(numbers.get(i).toString());
            numbersSum = numbersSum + numbers.get(i);
        }

        System.out.println("print numbers sum");
        str = stringNumbers.stream().collect(Collectors.joining(" + "));
        System.out.println(str + " = " + numbersSum);
    }

}