/**
 * 
 */
package demo4;

/**
 * @author Joel
 * @version Jan 31, 2017
 *
 */
public class Tarkkuus {

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        double a = 5.0;
        double eps = 4.0;
        
        int mikaTuli = tarkkuus(a, eps);
        System.out.println("Tarkkuus aliohjelma tulosti " + mikaTuli);
    }
        
        /**
         * Vertaillaan numeroita
         * @param x Annettu numero
         * @param eps Annettu eps
         * @return -1, 0 tai 1 riippuen numeroista
         * @example
         * <pre name="test">
         * tarkkuus(5.0,4.0) === 0;
         * tarkkuus(2.0,4.0) === -1;
         * tarkkuus(2.0,2.0) === 0;
         * </pre>
         */
        public static int tarkkuus(double x, double eps) {
            if(x < eps) return -1;
            if((-eps<=x)&&(x<=eps)) return 0;
            if(x>eps) return 1;
            return 0;
        }
}


