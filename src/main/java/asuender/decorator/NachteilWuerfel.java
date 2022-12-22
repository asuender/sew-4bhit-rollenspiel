package asuender.decorator;

import asuender.GenericWuerfel;

/**
 * @author Andreas Suender
 * @version 12-22-2022
 */
public class NachteilWuerfel extends ModifikatorDecorator {
    private GenericWuerfel nachteilWuerfel;

    public NachteilWuerfel(GenericWuerfel wuerfel, GenericWuerfel nachteilWuerfel) {
        super(wuerfel);
        this.nachteilWuerfel = nachteilWuerfel;
    }

    @Override
    public int wuerfeln() {
        return Math.min(super.wuerfeln(), this.nachteilWuerfel.wuerfeln());
    }

    @Override
    public String ausgabe() {
        return String.format("Nachteil(%s, %s)", super.ausgabe(), this.nachteilWuerfel.ausgabe());
    }
}
