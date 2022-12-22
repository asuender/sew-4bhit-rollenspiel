package asuender.decorator;

import asuender.GenericWuerfel;

/**
 * @author Andreas Suender
 * @version 12-22-2022
 */
public class VorteilWuerfel extends ModifikatorDecorator {
    private GenericWuerfel vorteilWuerfel;

    public VorteilWuerfel(GenericWuerfel wuerfel, GenericWuerfel vorteilWuerfel) {
        super(wuerfel);
        this.vorteilWuerfel = vorteilWuerfel;
    }

    @Override
    public int wuerfeln() {
        return Math.max(super.wuerfeln(), this.vorteilWuerfel.wuerfeln());
    }

    @Override
    public String ausgabe() {
        return String.format("Vorteil(%s, %s)", super.ausgabe(), this.vorteilWuerfel.ausgabe());
    }
}
