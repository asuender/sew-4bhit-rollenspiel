package asuender;

import java.util.Random;

/**
 * @author Andreas Suender
 * @version 12-22-2022
 */
public class Wuerfel implements GenericWuerfel {
    private final int numSeiten;
    private int ergebnis;

    public Wuerfel(int numSeiten) {
        this.numSeiten = numSeiten;

        this.wuerfeln();
    }

    @Override
    public int wuerfeln() {
        Random generator = new Random();
        this.ergebnis = generator.nextInt(numSeiten) + 1;

        return this.ergebnis;
    }

    @Override
    public String ausgabe() {
        return String.format("d%d: %d", this.numSeiten, this.ergebnis);
    }
}
