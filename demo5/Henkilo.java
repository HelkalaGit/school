package demo5;

import java.io.*;

import fi.jyu.mit.ohj2.*;

/**
 * Henkilo-luokka.  Henkilöllä on nimi ja syntymävuosi.
 * @author Joel
 * @version 1.0, 07.02.2003
 */
public class Henkilo {
    private String etunimi;
    private String sukunimi;
    private int syntymavuosi;


    /**
     * Alustetaan henkilön tiedot annetuilla arvoilla
     * @param etunimi henkilön uusi etunimi
     * @param sukunimi henkilön uusi sukunimi
     * @param syntymavuosi henkilön uusi syntymävuosi
     */
    public Henkilo(String etunimi, String sukunimi, int syntymavuosi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.syntymavuosi = syntymavuosi;
    }


    /**
     * @return tiedot | erotetussa muodossa
     * @example
     * <pre name="test">
     *   Henkilo aku = new Henkilo("Aku","Ankka",1934);
     *   aku.toString() === "Aku|Ankka|1934";
     *   Henkilo pele = new Henkilo("Pele","",1940);
     *   pele.toString() === "Pele||1940";
     * </pre>
     */
    @Override
    public String toString() {
        return etunimi + "|" + sukunimi + "|" + syntymavuosi;
    }


    /**
     * Palautetaan henkilön koko nimi
     * @return henkilön nimi muodossa etunimi sukunimi
     * @example
     * <pre name="test">
     *   Henkilo aku = new Henkilo("Aku","Ankka",1934);
     *   aku.getNimi() === "Aku Ankka";
     *   Henkilo pele = new Henkilo("Pele","",1940);
     *   pele.getNimi() === "Pele";
     * </pre>
     */
    public String getNimi() {
        return (etunimi + " " + sukunimi).trim();
    }


    /**
     * @return henkilön syntymävuosi
     * @example
     * <pre name="test">
     *   Henkilo aku = new Henkilo("Aku","Ankka",1934);
     *   aku.getSyntymavuosi() === 1934;
     * </pre>
     */
    public int getSyntymavuosi() {
        return syntymavuosi;
    }


    /**
     * Testataan henkilöluokkaa
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        Henkilo hlo = new Henkilo();
        Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
        System.out.println(hlo);
        hlo.parse("Sepe|Susi|1933");
        hlo.tulosta(System.out);
        aku.tulosta(System.out);
        Henkilo mikki = new Henkilo("Mikki|Hiiri");
        System.out.println(mikki);
    }


    /**
     * Tulostetaan henkilön tiedot paramterina tuotuu tietovirtaan
     * @param os tietovirta johon tiedot tulostetaan
     * @example
     * <pre name="test">
     * #import java.io.*;
     * ByteArrayOutputStream byteoutput = new ByteArrayOutputStream();
     * Henkilo hlo = new Henkilo("Aku","Ankka",1934);
     * hlo.tulosta(byteoutput);
     * byteoutput.toString() =R= "Aku Ankka 1934\\s*"
     * </pre>
     */
    public void tulosta(OutputStream os) {
        PrintStream out = new PrintStream(os);
        out.println(etunimi + " " + sukunimi + " " + syntymavuosi);
    }
    
    /**
     * Luodaan parametritön henkilö
     * @example
     * <pre name="test">
     * Henkilo asd = new Henkilo();asd.toString() === "||0";
     * </pre>
     */
    public Henkilo() {
        this.etunimi = "";
        this.sukunimi = "";
        this.syntymavuosi = 0;
    }
    
    /**
     * Siistitään lause tolpista
     * @param lause Annettu lause
     * @example
     * <pre name="test">
     * Henkilo asd = new Henkilo();
     * asd.parse("Jonne|Viljami|1994");asd.toString() === "Jonne|Viljami|1994";
     * </pre>
     */
    public void parse(String lause) {
       /* String[] osat = lause.split("\\|");
        if(osat.length == 0) this.etunimi = "";
        else
        this.etunimi = osat[0];
        if(osat.length == 1) this.sukunimi = "";
        else
        this.sukunimi = osat[1];
        if(osat.length == 2) this.syntymavuosi = 0;
        else
        this.syntymavuosi = Integer.parseInt(osat[2]);*/
        
        StringBuilder vara = new StringBuilder(lause);
        String a = Mjonot.erota(vara,'|');
        this.etunimi = a;
        String b = Mjonot.erota(vara, '|');
        this.sukunimi = b;
        int c = Mjonot.erota(vara, '|', 0);
        this.syntymavuosi = c;
        
    }
    
    /**
     * Annetaan merkkijono joka siistitään parsella
     * @param lause Annettu merkkijono
     * @example
     * <pre name="test">
     * Henkilo asd = new Henkilo("Mikki|Hiiri");asd.toString() === "Mikki|Hiiri|0";
     * </pre>
     */
    public Henkilo(String lause) {
        this.parse(lause);
    }
}