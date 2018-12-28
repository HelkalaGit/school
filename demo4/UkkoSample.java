package demo4;

import java.awt.Color;
import fi.jyu.mit.graphics.*;

/**
 * Piirret‰‰n ukkoja jotka liikkuvat ja pyˆriv‰t.
 * @author vesal
 */
public class UkkoSample {

    /**
     * Ukko-luokka josta saadaa viite toiseen k‰teen
     * @author vesal
     */
    public static class Ukko extends DrawableCollection {
        private final Drawable kasi;
        private final Drawable jalka;


        /**
         * Alustetaan ukko haluttuun paikkaa
         * @param dx ukon p‰‰n keskipiste
         * @param dy ukon p‰‰n keskipiste
         */
        public Ukko(double dx, double dy) {
            super();
            move(dx, dy, 0.0);
            add(new Circle(0, 0, 20));
            add(new Line(0, 0, 0, 100)).move(0, 20, 0);
            kasi = add(new Line(0, 0, 0, 90)).move(0, 30, 0).rotate(Axis.Z, 30);
            add(new Line(0, 0, 0, 90)).move(0, 30, 0).rotate(Axis.Z, -130);
            add(new Line(0, 0, 0, 100)).move(0, 120, 0).rotate(Axis.Z, 25);
            jalka = add(new Line(0, 0, 0, 100)).move(0, 120, 0).rotate(Axis.Z, -25);
        }


        /**
         * Alustetaan ukko haluttuun paikkaan ja kokoon
         * @param dx ukon p‰‰n keskipiste
         * @param dy ukon p‰‰n keskipiste
         * @param s  ukon skaalauskerroin
         * @param deg ukon kiertokulma Z-akselin suhteen
         * @param color ukon v‰ri
         */
        public Ukko(double dx, double dy, double s, double deg, Color color) {
            this(dx, dy);
            if (s != 1) scale(s, s, s);
            if (deg != 0) rotate(Axis.Z, deg);
            if (color != null) setColor(color);
        }


        /**
         * @return palautetaan viite ukon toisen k‰teen
         */
        public Drawable getKasi() {
            return kasi;
        }


        /**
         * @return palautetaan viite ukon toisen k‰teen
         */
        public Drawable getJalka() {
            return jalka;
        }

    }


    /**
     * @param args ei k‰ytˆss‰
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Window window = new Window();
        window.add(new Ukko(60, 60));
        Ukko pukko = new Ukko(160, 60, 0.5, 0, Color.RED);
        window.add(pukko);
        Drawable oukko = window.add(new Ukko(260, 60, 0.3, 0, Color.ORANGE));
        window.showWindow();
        Ukko ukko = new Ukko(260, 180, 0.3, 0, null);
        window.add(ukko);

        new Rotator(ukko, Axis.Z, 3, 200);
        new Rotator(ukko.getKasi(), Axis.Z, 5, 230);
        new Mover(oukko, 2, 3, 0, 300);
        new Rotator(oukko, Axis.Y, 10, 230);

        // window.scale(0.5,2, 1);

        // Esimerkki ukon siirtamisesta hiiren kohdalle.
        new MouseFollower(window.getPanel(), pukko, 0, 0, 0, true);

        // window.getPanel().setBackground(Color.CYAN);
        window.setTitle("Ukot heiluu");
    }

}