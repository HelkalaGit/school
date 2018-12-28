package demo.d6.kulkuneuvot;



/**
 * Luodaan laiva
 * @author Joel
 * @version Feb 17, 2017
 *
 */
public class Laiva extends Kulkuneuvo {

    /**
     * Luo uuden laivan
     * @param nopeus Laivan nopeus
     * @param matkustajat Laivan matkustajien lukumäärä
     */
    public Laiva(String nopeus, int matkustajat) {
        super(nopeus, matkustajat);
    }
    
    /**
     * Kuunnellaan kapteenin kuulutus
     */
    @Override
    public void kuulutus() {
        System.out.println("Nyt törmätään jäähän!");
    }

    /**
     * Testataan Laiva-luokkaa
     * @param args ei käytössä
     */
    public static void main(String[] args) {

        Laiva titanic = new Laiva("160 solmua", 18000);
        titanic.kuulutus();
        System.out.println(titanic);

        Laiva poseidon = new Laiva("170 solmua", 930);
        poseidon.kuulutus();
        System.out.println(poseidon);
    }

}
