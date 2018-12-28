package demo.d6.kulkuneuvot;

/**
 * Kulkuneuvo luokka, kantaluokka kulkuneuvoille
 * @author Joel
 * @version Feb 17, 2017
 *
 */
public class Kulkuneuvo {

    private String nopeus;
    private int matkustajat;
    
    /**
     * Luodaan uusia kulkuneuvoja
     * @param nopeus kulkuneuvon nopeus
     * @param matkustajat kulkuneuvon matkustajien lukum‰‰r‰
     */
    public Kulkuneuvo(String nopeus, int matkustajat) {
        this.nopeus = nopeus;
        this.matkustajat = matkustajat;
    }
    
    /**
     * Mit‰ kapteeni kuuluttaa
     */
    public void kuulutus(){
        System.out.println("???");
    }
    
    /**
     * @return Kulkuneuvon tiedot muodossa "Ferrari 2"
     */
    @Override
    public String toString() {
        return nopeus + " " + matkustajat;
    }
}
