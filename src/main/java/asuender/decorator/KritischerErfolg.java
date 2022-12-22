package asuender.decorator;

import asuender.GenericWuerfel;

/**
 * @author Andreas Suender
 * @version 12-22-2022
 */
public class KritischerErfolg extends ModifikatorDecorator {
    public KritischerErfolg(GenericWuerfel wuerfel) {
        super(wuerfel);
    }

    @Override
    public int wuerfeln() {
        return super.wuerfeln() * 2;
    }

    @Override
    public String ausgabe() {
        return String.format("Kritisch(%s)", super.ausgabe());
    }
}
