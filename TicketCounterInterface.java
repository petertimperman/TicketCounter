package com.petertimperman;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by PeterTimperman on 5/11/18.
 */
public class TicketCounterInterface {
    private JFrame mainFrame;
    private JLabel destinationLabel;
    private JLabel originLabel;
    private JLabel dateLabel;
    private JComboBox destiantionSelect;
    private JComboBox originSelect;
    private JComboBox dateSelect;
    private JLabel etaLab;

    public TicketCounterInterface(){
        drawGUI();

    }
    private void drawGUI(){
        mainFrame = new JFrame("TickerCounter");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new FlowLayout());


        destinationLabel = new JLabel("Select Destination");
        originLabel = new JLabel("Select Origin");
        dateLabel = new JLabel("Select Departure Data");

        originSelect = new JComboBox();
        destiantionSelect = new JComboBox();
        dateSelect = new JComboBox();


        mainFrame.add(destinationLabel);
        mainFrame.add(originLabel);
        mainFrame.add(dateLabel);
        mainFrame.add(originSelect);
        mainFrame.add(destiantionSelect);
        mainFrame.add(dateSelect);
        mainFrame.setVisible(true);
    }

}
