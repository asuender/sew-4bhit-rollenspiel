package asuender;

import asuender.decorator.AdditiverWuerfel;
import asuender.decorator.VorteilWuerfel;

/**
 * @author Andreas Suender
 * @version 12-22-2022
 */
public class WuerfelTest {
    public static void main(String[] args) {
        GenericWuerfel w1 =
                new AdditiverWuerfel(new AdditiverWuerfel(new VorteilWuerfel(new Wuerfel(20), new
                        Wuerfel(20)), 2, "Proficiency"), 3, "Ability");

        int ergebnis = w1.wuerfeln();

        System.out.printf("%s\t=\t%d\n", w1.ausgabe(), ergebnis);
    }
}
