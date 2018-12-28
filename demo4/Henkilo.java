/**
 * 
 */
package demo4;

/**
 * Luodaan Henkil� olio
 * @author Joel
 * @version Jan 30, 2017
 *
 */
public class Henkilo {
    private String etunimi;
    private String sukunimi;
    private int syntymavuosi;

    /**
     * Alustetaan Henkil�n nimet ja syntym�vuosi
     * @param etunimi Henkil�n etunimi
     * @param sukunimi Henkil�n sukunimi
     * @param syntymavuosi Henkil�n syntym�vuosi
     */
    public Henkilo(String etunimi, String sukunimi, int syntymavuosi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.syntymavuosi = syntymavuosi;
    }
    
    /**
     * @return Nimen muodossa Aku|Ankka|1934
     * @example
     * <pre name="test">
     * new Henkilo("Aku", "Ankka", 1934).toString() === Aku|Ankka|1934;
     * </pre>
     */
    @Override
    public String toString() {
        return this.etunimi + "|" + this.sukunimi + "|" + this.syntymavuosi;
    }
    
    /**
     * Luodaan Henkil� olio
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
        System.out.println(aku.getNimi());  // tulostaa Aku Ankka
        System.out.println(aku.getSyntymavuosi());  // tulostaa 1934
        System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
    }

    /**
     * Syntym�vuosi metodi
     * @return Syntym�vuosi
     */
    private int getSyntymavuosi() {
        return this.syntymavuosi;
    }

    /**
     * Nimi metodi
     * @return Koko nimen
     * @example
     * <pre name="test">
     * new Henkilo("Aku","Ankka", 1934).getNimi() === "Aku Ankka";
     * </pre>
     */
    private String getNimi() {
       return this.etunimi + " " + this.sukunimi;
    }

}
