/**
 * 
 */
package demo4;

/**
 * @author Joel
 * @version Jan 31, 2017
 *
 */
public class Demopisteet {

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
    
        int tehdyt1 = 55;
        int tehdyt2 = 23;
        int tehdyt3 = 45;
        int tehdyt4 = 20;
        int tehdyt5 = 32;
        int maksimi = 56;
        int maksimi2 = 40;
        
        int jakso1 = 1;
        int jakso2 = 2;
        
        int hyvityspisteet = demopisteet(tehdyt1,maksimi,jakso1);
        System.out.println("Jakso 1. saadut hyvityspisteet :" + hyvityspisteet);
        int hyvityspisteet1 = demopisteet(tehdyt2,maksimi,jakso1);
        System.out.println("Jakso 1. saadut hyvityspisteet :" + hyvityspisteet1);
        int hyvityspisteet2 = demopisteet(tehdyt3,maksimi,jakso1);
        System.out.println("Jakso 1. saadut hyvityspisteet :" + hyvityspisteet2);
        int hyvityspisteet3 = demopisteet(tehdyt4,maksimi2,jakso2);
        System.out.println("Jakso 2. saadut hyvityspisteet :" + hyvityspisteet3);
        int hyvityspisteet4 = demopisteet(tehdyt5,maksimi2,jakso2);
        System.out.println("Jakso 2. saadut hyvityspisteet :" + hyvityspisteet4);
        
    
    }
    
    /**
     * Lasketaan demotehtävien hyvityspisteet
     * @param pisteet saadut pisteet
     * @param maksimi maksimi pisteet
     * @param mikaJakso minkä jakson pisteet
     * @return saadut hyvityspisteet
     * @example
     * <pre name="test">
     * demopisteet(40,56,1) === 4;
     * demopisteet(22,56,1) === 0;
     * demopisteet(55,56,1) === 6;
     * demopisteet(32,40,2) === 10;
     * </pre>
     */
    public static int demopisteet(int pisteet, int maksimi,int mikaJakso) {
        double prosentti = (double)pisteet / (double)maksimi;
        prosentti = prosentti * 100;
        int a = 6;
        
        Double d = new Double(prosentti);
        int i = d.intValue();
        
        if(i < 40) {
            i = 0;
            return i;
        }
        
        for(int x = 90; x >= 40; x-=10) {
            if(i >= x) {
                i = a;
                continue;
            }
            a--;
        }if(mikaJakso == 1) return i;
        return i*2;
        
    }

}
