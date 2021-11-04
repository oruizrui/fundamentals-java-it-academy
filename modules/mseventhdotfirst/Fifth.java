/* 
(M7.1.) Exercici 5

Mostra per pantalla els nombres parells compresos entre el 100 i el 0 en ordre descendent.
*/

package modules.mseventhdotfirst;

import java.util.ArrayList;
import java.util.Collections;

public class Fifth {
    public static void main(String[] args) {
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        int startAt = 0;
        int endAt = 100;

        pairs = findPairsBetween(pairs, startAt, endAt);
        Collections.sort(pairs, Collections.reverseOrder());

        System.out.println(pairs);
    }

    private static ArrayList<Integer> findPairsBetween(ArrayList<Integer> arr, int startAt, int endAt) {
        for (int i = startAt; i <= endAt; i++) {
            if (i % 2 == 0) {
                arr.add(i);
            }
        }

        return arr;
    }

}
