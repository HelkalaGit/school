/**
 * 
 */
package demo4;

import java.text.DecimalFormat;

/**
 * Lasketaan kolmion hypotenuusa ja pinta-ala
 * @author Joel
 * @version Jan 30, 2017
 *
 */
public class Kolmio {

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
    
    int kanta = 2;
    int korkeus = 4;
    
    int ala = kolmionAla(kanta, korkeus);
    System.out.println("Kolmion pinta-ala on " + ala + " cm2");
    
    double hypo = hypotenuusa(kanta, korkeus);
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    
    System.out.println("Kolmion hypotenuusa on "+ (numberFormat.format(hypo)) + " cm");
    }
    
    /**
     * Lasketaan kolmion pinta-ala
     * @param kanta annettu kanta
     * @param korkeus annettu korkeus
     * @return pinta-ala
     * @example
     * <pre name="test">
     * kolmionAla(0, 1) ~~~ 0;
     * kolmionAla(2, 2) ~~~ 2;
     * </pre>
     */
     public static int kolmionAla(int kanta, int korkeus){
         if((kanta == 0) || (korkeus == 0)) return 0;
         return kanta * korkeus / 2;
     }
     
     /**
      * Lasketaan kolmion hypotenuusa
      * @param kanta annettu kanta
      * @param korkeus annettu korkeus
      * @return hypotenuusan pituus
      * @example
      * <pre name="test">
      * #TOLERANCE=0.01
      *  hypotenuusa(0,0) ~~~ 0.0;
      *  hypotenuusa(1,1) ~~~ 1.41;
      *  hypotenuusa(5,6) ~~~  7.81;
      * </pre>
      */
      public static double hypotenuusa(int kanta, int korkeus){
          if((kanta == 0) || (korkeus == 0)) return 0.0;
          double hypo = kanta * kanta + korkeus * korkeus;
          hypo = Math.sqrt(hypo);
          return hypo;
      }

}
