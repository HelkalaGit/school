/**
 * 
 */
package demo4;

import java.util.Arrays;

/**
 * @author Joel
 * @version Jan 30, 2017
 *
 */
public class Tauno {

    /**
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        int[] t = { 23, 45, 12, 9, 3, 7 };
        System.out.println("Aluksi : " + Arrays.toString(t));
        KasitteleTaulukko(t);
        System.out.println("Lopuksi: " + Arrays.toString(t));
    }


    /**
     * Aliohjelmalla k�sitell��n taulukko sovitulla tavalla
     * @param t taulukko joka k�sitell��n
     * @example
     * #import java.util.Arrays;
     * <pre name="test">
     *  int[] t; 
     *  t = new int[]{$t1}; KasitteleTaulukko(t); Arrays.toString(t) === "[$t2]";
     *
     *  $t1                |   $t2
     * ------------------------------------------------
    *    55, 44, 33, 2, 5, 9 | 60, 49, 38, 7, 10, 14
    *    23, 45, -12, 9, 0, -5 | 28, 50, -7, 14, 5, 0
     * </pre>
     */
    public static void KasitteleTaulukko(int[] t) {
        int lisattava = 5;
        int i = 0;
        
        while (i < t.length) {
            t[i] = t[i] + lisattava;
            i++;
        }
    }

}
