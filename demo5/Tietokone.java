package demo5;

import java.io.OutputStream;
import java.io.PrintStream;

public class Tietokone {
    
    private int muisti;
    private int kovalevy;
    private int naytonohjain;
    private int prosessori;
    private int kaytettyTila;
    
    /**
     * Luodaan uusi tietokone
     * @param muisti Tietokoneen muisti
     * @param kovalevy Tietokoneen kovalevy
     * @param naytonohjain Tietokoneen näytönohjain
     * @param prosessori Tietokoneen prosessori
     */
    public Tietokone(int muisti, int kovalevy, int naytonohjain, int prosessori) {
        this.muisti = muisti;
        this.kovalevy = kovalevy;
        this.naytonohjain = naytonohjain;
        this.prosessori = prosessori;
    }
    
    /**
     * Parannellaan osia
     * @param muisti Muisti
     * @param kovalevy Kovalevy
     * @param naytonohjain Naytonohjain
     * @param prosessori Prosessori
     */
    public void lisaa(int muisti, int kovalevy, int naytonohjain, int prosessori) {
        this.muisti = this.muisti += muisti;
        this.kovalevy = this.kovalevy += kovalevy;
        this.naytonohjain = this.naytonohjain += naytonohjain;
        this.prosessori = this.prosessori += prosessori;
    }
    
    /**
     * Asennetaan koneelle ohjelmia
     * @param tila Kuinka paljon tilaa ohjelma vie
     * @return True tai False riippuen mahtuuko ohjelma koneelle.
     */
    public boolean asenna(int tila){
        int vapaata = this.kovalevy - this.kaytettyTila;
        if(vapaata < tila) return false;
        this.kaytettyTila = this.kaytettyTila + tila;
        return true;
    }
    
    public void tulosta(OutputStream os){
        PrintStream out = new PrintStream(os);
        out.println("Muistia on : " + this.muisti);
        out.println("Kovalevyn koko on : " + this.kovalevy);
        out.println("Näytön ohjain on : GeForce "+ this.naytonohjain);
        out.println("Prosessorina toimii : i"+this.prosessori);
        
        
    }
    
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        Tietokone t1 = new Tietokone(8,1000,1060,8);
        //Tietokone t2 = new Tietokone(1000);
        //Tietokone t3 = new Tietokone(1080);
        
        t1.lisaa(0,500,20,0);
        boolean a = t1.asenna(40);
        if(a == false ) System.out.println("Ei koneelle mahdu noin paljoa!");
        else System.out.println("Ohjelma asennettu!");
        
        boolean b = t1.asenna(2000);
        if(b == false ) System.out.println("Ei koneelle mahdu noin paljoa!");
        else System.out.println("Ohjelma asennettu!");
        
        
        System.out.println("Tietokoneen specist ovat:");
        t1.tulosta(System.out);
        
        
    }
}
