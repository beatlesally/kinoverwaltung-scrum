package at.itkolleg.ase.tdd.kino;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ZahlungsmethodeTest {

    private Zahlungsmethode zahlungsmethode;

    @Test
    void testGetterZahlungsmethode(){
        zahlungsmethode = new Zahlungsmethode("Paypal", "https://www.paypal.com/at/home");
        assertEquals("Paypal", zahlungsmethode.getName());
        assertEquals("https://www.paypal.com/at/home", zahlungsmethode.getLink());
    }

}
