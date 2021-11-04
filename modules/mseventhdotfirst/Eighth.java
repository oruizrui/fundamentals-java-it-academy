/* 
(M7.1.) Exercici 8

Crea un programa on l’usuari introdueixi una temperatura en ºC i es mostri per pantalla la conversió en ºFahrenheit
*/

package modules.mseventhdotfirst;

import java.util.Scanner; // import the Scanner class 

public class Eighth {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Double degree = 0.0;

        System.out.println("Celcius degrees");
        degree = myScan.nextDouble();
        myScan.close();

        System.out.println(degree + " °C are " + celciusToFahrenheit(degree) + " °F");
    }

    private static Double celciusToFahrenheit(Double temperature) {
        return (temperature * 9 / 5) + 32;
    }
}
