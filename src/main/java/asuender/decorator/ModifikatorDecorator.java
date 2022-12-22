package asuender.decorator;

import asuender.GenericWuerfel;

/**
 * @author Andreas Suender
 * @version 12-22-2022
 */
public abstract class ModifikatorDecorator implements GenericWuerfel {
    private GenericWuerfel wuerfel;

    public ModifikatorDecorator(GenericWuerfel wuerfel) {
        this.wuerfel = wuerfel;
    }

    @Override
    public int wuerfeln() {
        return wuerfel.wuerfeln();
    }

    @Override
    public String ausgabe() {
        return wuerfel.ausgabe();
    }
}
