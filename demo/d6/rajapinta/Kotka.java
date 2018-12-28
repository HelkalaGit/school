package demo.d6.rajapinta;

/**
 * @author Joel
 * @version Feb 17, 2017
 *
 */
public class Kotka implements ElainRajapinta {
     
    private String nimi;
    private double paino;
    
    /**
     * Alustetaan koiran tiedot
     * @param nimi koiran nimi
     * @param paino koiran paino
     */
    public Kotka(String nimi, double paino) {
        this.nimi = nimi;
        this.paino = paino;
    }
    
    /**
     * Ääntele kuin kotka, kai
     */
    @Override
    public void aantele(){
        System.out.println("Raaawwwr!");
    }
    
    @Override
    public String toString() {
        return ("" + this.nimi + " " + this.paino);
    }
    
    /**
     * Luodaan kotkia
     * @param args ei käytössä
     */
    public static void main(String[] args){
        
        Kotka kolli = new Kotka("Raipe", 1800);
        kolli.aantele();
        System.out.println(kolli);

        Kotka killi = new Kotka("Rolle", 21000);
        killi.aantele();
        System.out.println(killi);
    }

}
