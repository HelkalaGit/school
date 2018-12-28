package demo.d6.kulkuneuvot;

/**
 * 
 * @author Joel
 * @version Feb 17, 2017
 *
 */
public class Lentokone extends Kulkuneuvo {

    /**
     * Luodaan lentokone
     * @param nopeus lentokoneen nopeus
     * @param matkustajat matkustajien määrä
     */
    public Lentokone(String nopeus, int matkustajat) {
        super(nopeus, matkustajat);
    }
    
    @Override
    public void kuulutus() {
        System.out.println("Nyt tiputaan!");
    }

    /**
     * @param args ei käytössä
     */ 
    public static void main(String[] args) {
        Kulkuneuvo vempeleet[] = {
                new Laiva("170 solmua", 18005),
                new Lentokone("1700 kmh", 18000),
                new Laiva("5 solmua", 1930),
                new Lentokone("21000 kmh", 980),
        };

        for (int i = 0; i < vempeleet.length; i++) {
            vempeleet[i].kuulutus();
            System.out.println(vempeleet[i].toString());
        }
    }
}

