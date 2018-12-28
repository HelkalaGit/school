/**
 * 
 */
package demo5;

import java.util.Arrays;

/**
 * @author Joel
 * @version Feb 7, 2017
 *
 */
public class Tauno {

    /**
     * @param args ei käytössä
     */
    public static void main(String args[])
    {
        int[] t = { 23, 45, 12, 9, 3, 7 };
        System.out.println("Aluksi : " + Arrays.toString(t));
        KasitteleTaulukko(t);
        System.out.println("Lopuksi: " + Arrays.toString(t));
    }


    /**
     * Aliohjelmalla käsitellään taulukko sovitulla tavalla
     * @param t taulukko joka käsitellään
     * @example
     * #import java.util.Arrays;
     * <pre name="test">
     *  int[] t; 
     *  t = new int[]{$t1}; KasitteleTaulukko(t); Arrays.toString(t) === "[$t2]";
     *
     *  $t1                |   $t2
     * ------------------------------------------------
    *    55, 44, 33, 2, 5, 9 | 9, 5, 2, 33, 44, 55
    *    23, 45, 12, 9, 3, 7 | 7, 3, 9, 12, 45, 23
    *    11, 12, 43, 1, 5, 2, 2 | 2, 2, 5, 1, 43, 12, 11
     * </pre>
     */
    public static void KasitteleTaulukko(int[] t)
    {
        
        int pituus = t.length -1;
        int muuttuja = 0;
        int i = 0;
        
        while(i < t.length/2){
        muuttuja = t[i];
        t[i] = t[pituus - i];
        t[pituus - i] = muuttuja;
        i++;
        }

    }

}
