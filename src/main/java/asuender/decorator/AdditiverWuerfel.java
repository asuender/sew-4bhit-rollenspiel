package asuender.decorator;

import asuender.GenericWuerfel;

/**
 * @author Andreas Suender
 * @version 12-22-2022
 */
public class AdditiverWuerfel extends ModifikatorDecorator {
    private int bonus;
    private String infotext;

    public AdditiverWuerfel(GenericWuerfel wuerfel, int bonus, String infotext) {
        super(wuerfel);
        this.bonus = bonus;
        this.infotext = infotext;
    }

    @Override
    public int wuerfeln() {
        return super.wuerfeln() + bonus;
    }

    @Override
    public String ausgabe() {
        return String.format("%s + %d (%s)", super.ausgabe(), this.bonus, this.infotext);
    }
}
