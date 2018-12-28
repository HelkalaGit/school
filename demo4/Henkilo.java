/**
 * 
 */
package demo4;

/**
 * Luodaan Henkilö olio
 * @author Joel
 * @version Jan 30, 2017
 *
 */
public class Henkilo {
    private String etunimi;
    private String sukunimi;
    private int syntymavuosi;

    /**
     * Alustetaan Henkilön nimet ja syntymävuosi
     * @param etunimi Henkilön etunimi
     * @param sukunimi Henkilön sukunimi
     * @param syntymavuosi Henkilön syntymävuosi
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
     * Luodaan Henkilö olio
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
        System.out.println(aku.getNimi());  // tulostaa Aku Ankka
        System.out.println(aku.getSyntymavuosi());  // tulostaa 1934
        System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
    }

    /**
     * Syntymävuosi metodi
     * @return Syntymävuosi
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
