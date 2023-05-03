package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TicketTest {

    Ticket ticket;

    @BeforeEach
    void setup(){
        ticket = new Ticket("KS1",Zeitfenster.ABEND, LocalDate.now(),'A',10);
    }

    @Test
    public void testTicketKaufen(){
        assertEquals("Ticket gekauft",ticket.ticketKaufen());
    }
}
