package demo5;

/**
 * @author Joel
 * @version Feb 8, 2017
 *
 */
public class LinjaAuto {

    private int maara;
    
    /**
     * Luodaan linja-auto
     * @param maara matkustajien m‰‰r‰
     * @example
     * <pre name="test">
     * LinjaAuto a = new LinjaAuto(31);
     * a.getMaara() ~~~ 31;
     * </pre>
     */
    public LinjaAuto(int maara) {
        this.maara = maara;
    }
    
    /**
     * @return bussin matkustaja m‰‰r‰
     * @example
     * <pre name="test">
     * LinjaAuto a = new LinjaAuto(31);
     * a.getMaara() ~~~ 31;
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
     * LinjaAuto a = new LinjaAuto(31);
     * a.vahenna(3);
     * a.getMaara() ~~~ 28;
     * </pre>
     */
    public int vahenna(int paljon) {
        this.maara = maara - paljon;
        return this.maara;
    }
    
    /**
     * Lis‰t‰‰n bussiin ihmisi‰
     * @param paljon Paljonko lis‰t‰‰n
     * @return Matkustaja m‰‰r‰ lis‰yksen j‰lkeen
     * LinjaAuto a = new LinjaAuto(43);
     * a.lisaa(10);
     * a.getMaara() ~~~ 53;
     */
    public int lisaa(int paljon) {
        this.maara = maara + paljon;
        return this.maara;
    }
    
    /**
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
        LinjaAuto bussi = new LinjaAuto(40);
        
        bussi.vahenna(10);
        bussi.lisaa(4);
        
        System.out.println("Bussissa on " + bussi.getMaara() + " ihmist‰");
    }
}
