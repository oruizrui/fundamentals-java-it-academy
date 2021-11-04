/* 
(M4) Exercici 6

Fer un programa que demani a l’usuari quin dia i quin mes va néixer, amb aquesta informació el programa mostra per pantalla, de quin signe del zodíac és.

Àries-Aries (21.03 — 19.04)
Taure-Tauro (20.04 — 20.05)
Bessons-Géminis (21.05 — 20.06)
Cranc-Cáncer (21.06 — 22.07)
LLeó-Leo (23.07 — 22.08)
Verge-Virgo (23.08 — 22.09)
Balança-Libra (23.09 — 22.10)
Escorpi-Escorpio (23.10 — 21.11)
Sagitario-Sagitario (22.11 — 21.12)
Capricorn-Capricornio (22.12 — 19.01)
Aquari-Acuario (20.01 — 18.02)
Peixos-Piscis (19.02 — 20.03)
*/

package modules.mseventhdotfirst;

import java.util.Scanner; // import the Scanner class 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Sixth {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Calendar myCal = new GregorianCalendar();

        Date date = null;
        String userBirthday = "";
        String year = "";

        System.out.println("when is your birthday? (dd/MM/yyyy)");
        userBirthday = myScan.nextLine();
        myScan.close();

        date = parseDate(userBirthday);
        myCal.setTime(date);
        year = String.valueOf(myCal.get(Calendar.YEAR));

        if (isBetweenDates(date, "21.03", "19.04", year)) {
            System.out.println("Àries-Aries (21.03 — 19.04)");
        } else if (isBetweenDates(date, "20.04", "20.05", year)) {
            System.out.println("Taure-Tauro (20.04 — 20.05)");
        } else if (isBetweenDates(date, "21.05", "20.06", year)) {
            System.out.println("Bessons-Géminis (21.05 — 20.06)");
        } else if (isBetweenDates(date, "21.06", "22.07", year)) {
            System.out.println("Cranc-Cáncer (21.06 — 22.07)");
        } else if (isBetweenDates(date, "23.07", "22.08", year)) {
            System.out.println("LLeó-Leo (23.07 — 22.08)");
        } else if (isBetweenDates(date, "23.08", "22.09", year)) {
            System.out.println("Verge-Virgo (23.08 — 22.09)");
        } else if (isBetweenDates(date, "23.09", "22.10", year)) {
            System.out.println("Balança-Libra (23.09 — 22.10)");
        } else if (isBetweenDates(date, "23.10", "21.11", year)) {
            System.out.println("Escorpi-Escorpio (23.10 — 21.11)");
        } else if (isBetweenDates(date, "22.11", "21.12", year)) {
            System.out.println("Sagitario-Sagitario (22.11 — 21.12)");
        } else if (isBetweenDates(date, "22.12", "31.12", year)) { // Capricorn-Capricornio (22.12 — 19.01)
                                                                   // not same year!
            System.out.println("Capricorn-Capricornio (22.12 — 19.01)");
        } else if (isBetweenDates(date, "01.01", "19.01", year)) {
            System.out.println("Capricorn-Capricornio (22.12 — 19.01)");
        } else if (isBetweenDates(date, "20.01", "18.02", year)) {
            System.out.println("Aquari-Acuario (20.01 — 18.02)");
        } else if (isBetweenDates(date, "19.02", "20.03", year)) {
            System.out.println("Peixos-Piscis (19.02 — 20.03)");
        } else {
            System.out.println("bad range data provided");
        }
    }

    private static Date parseDate(String date) {
        Date output = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            output = format.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return output;
    }

    private static Boolean isBetweenDates(Date date, String startAt, String endAt, String year) {
        return date.compareTo(buildDate(startAt, year)) >= 0 && date.compareTo(buildDate(endAt, year)) <= 0;
    }

    private static Date buildDate(String dayMonth, String year) {
        String newDate = dayMonth + "." + year;

        return parseDate(newDate.replace(".", "/"));
    }
}
