package demo.d6.perinta;

/**
 * @author Joel
 * @version Feb 17, 2017
 *
 */
public class Kotka extends Elain {

    /**
     * @param nimi Eläimen nimi
     * @param paino Eläimen paino
     */
    public Kotka(String nimi, double paino) {
        super(nimi,paino);
    }
    
    /**
     * Ääntele kuin kotka/ish
     */
    @Override
    public void aantele(){
        System.out.println("Raaawr");
    }
    
    /**
     * Testataan Kissa-luokkaa
     * @param args ei käytössä
     */
    public static void main(String[] args) {

        Kotka lilli = new Kotka("Rolle", 21000);
        lilli.aantele();
        System.out.println(lilli);

        Kotka lellu = new Kotka("Rellu", 930);
        lellu.aantele();
        System.out.println(lellu);
    }

}
