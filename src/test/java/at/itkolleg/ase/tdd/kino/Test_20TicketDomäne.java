package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_20TicketDomäne {

    @Test
    public void Test_getRanking()
    {
        Ticket ticket = new Ticket("Alpine", Zeitfenster.ABEND, LocalDate.parse("2023-05-06"), 'A', 12);
        assertSame(2, ticket.getRanking());
    }
}
