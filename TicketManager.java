package com.petertimperman;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by PeterTimperman on 5/11/18.
 */
public class TicketManager {


    private ArrayList<Ticket> tickets;

    public TicketManager() {
        this.tickets = new ArrayList<Ticket>();

    }

    public void saveTickets(Connection conn) {
        for (Ticket ticket : this.tickets) {
            String insertStatement = createInsertStatement(ticket);
            try {
                Statement stmt = conn.createStatement();
                stmt.execute(insertStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    public String createInsertStatement(Ticket ticket) {
        return String.format("INSERT INTO tickets VALUES(\"%s\", \"%s\", %s, %d)", ticket.getCustomer(), ticket.getFlyerName(), ticket.isChild(), ticket.getFlight().getId());
    }

    public void createTicket(String customer, String flyerName, boolean isChild, Flight flight) {
        tickets.add(new Ticket(customer, flyerName, isChild, flight));
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
}
