package com.petertimperman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TicketCounter {
    private TicketCounterInterface ticketCounterInterface;
    private DatabaseManager databaseManager;
    public static void main(String[] args) {
        String password = "";
        String user = "";
        String credFile = "databaseCreds";
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(credFile);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("password")) {
                    password = line.split(" ")[1];
                } else if (line.contains("username")) {
                    user = line.split(" ")[1];
                }

            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            credFile + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + credFile + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        TicketCounter ticketCounter = new TicketCounter(password, user);
    }

    public TicketCounter(String password, String user) {
        this.ticketCounterInterface = new TicketCounterInterface();
        this.databseManager = new DatabaseManager();
    }

}
