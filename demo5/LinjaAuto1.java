package demo5;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * @author Joel
 * @version Feb 8, 2017
 *
 */
public class LinjaAuto1 {

    private int maara;
    private int matkustajia;
    private int tilaa;
    
    /**
     * Luodaan linja-auto
     * @param maara matkustajien m‰‰r‰
     * @example
     * <pre name="test">
     * LinjaAuto1 a = new LinjaAuto1(31);
     * a.getTilaa() ~~~ 31;
     * </pre>
     */
    public LinjaAuto1(int maara) {
        this.maara = maara;
    }
    
    /**
     * @return bussin matkustaja m‰‰r‰
     * @example
     * <pre name="test">
     * LinjaAuto1 a = new LinjaAuto1(31);
     * a.getTilaa() ~~~ 31;
     * </pre>
     */
    public int getMaara() {
        return maara;
    }
    
    /**
     * V‰hent‰‰ matkustajien m‰‰r‰‰
     * @param paljon Kuin paljon v‰hennet‰‰n
     * @return Matkustajia v‰hennyksen j‰lkeen
     * @example
     * <pre name="test">
     * LinjaAuto1 a = new LinjaAuto1(31);
     * a.lisaa(4);
     * a.vahenna(3);
     * a.tulosta(System.out); === "31,1,30";
     * </pre>
     */
    public int vahenna(int paljon) {
        int a = matkustajia;
        if(paljon > matkustajia) {
            matkustajia = matkustajia - matkustajia;
            return a - paljon;
        }
        matkustajia = matkustajia - paljon;
        return matkustajia;
    }
    
    /**
     * Lis‰t‰‰n bussiin ihmisi‰
     * @param paljon Paljonko lis‰t‰‰n
     * @return Matkustaja m‰‰r‰ lis‰yksen j‰lkeen
     * LinjaAuto1 a = new LinjaAuto1(43);
     * a.lisaa(10);
     * a.tulosta(System.out); === "43,10,33";
     */
    public int lisaa(int paljon) {
        double a = 0;
        double siirrettava =  maara - matkustajia;
        if(paljon > siirrettava){
            a = maara - matkustajia;
            int b = matkustajia;
            matkustajia += a;
            return (b + paljon) - maara;
        }
        matkustajia += paljon;
        return 0;
    }
    
   /**
    * asdasd
    * @param out asdasd
    */
    public void tulosta(PrintStream out) {
         out.println("" + this.maara + "," + this.matkustajia + "," + (this.maara - this.matkustajia));
    }
    
    /**
     * Katsotaan paljon bussissa on tilaa.
     * @return Paljonko on tilaa.
     */
    public int getTilaa() {
        return maara - matkustajia;
    }
    
    /**
     * Onko bussissa tilaa
     * @return On tai ei
     */
    public boolean tilaa() {
        if(maara-matkustajia > 0) return true;
        return false;
    }
    
    /**
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
        LinjaAuto1 pikkubussi = new LinjaAuto1(10);
        LinjaAuto1 isobussi = new LinjaAuto1(45);
        
        pikkubussi.lisaa(4);
        pikkubussi.tulosta(System.out); // 10,4,6
        isobussi.lisaa(30);
        isobussi.tulosta(System.out); // 45,30,15
        
        int yli = pikkubussi.lisaa(15);
        isobussi.lisaa(yli);
        pikkubussi.tulosta(System.out); //10,10,0
        isobussi.tulosta(System.out); // 45,39,6
        
        if(pikkubussi.getTilaa() > 0)
            System.out.println("Pieneen bussiin mahtuu!"); // ei tulosta
        if(isobussi.tilaa() )
            System.out.println("Isoon bussiin mahtuu!"); // tulostaa
        
        int vajaa = pikkubussi.vahenna(12); // vajaa = -2
        if(vajaa < 0) 
            System.out.println("Pikkubussisa ei edes ole n‰in montaa!");
        pikkubussi.tulosta(System.out);
         
       }
}
