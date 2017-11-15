package SystemCode;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

// @author Billy McCann
public class FlightCalculator extends JFrame implements ActionListener {
    JPanel westPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    // flight  options
    JRadioButton Ireland = new JRadioButton("Ireland");
    JRadioButton Europe = new JRadioButton("Europe");
    JRadioButton US = new JRadioButton("US");
    JRadioButton Asia = new JRadioButton("Asia");
    JRadioButton Africa = new JRadioButton("Africa");
    JRadioButton Australia = new JRadioButton("Australia");
    

    // flight  choices
    JRadioButton Business = new JRadioButton("Business");
    
    // calculate, clear, and total buttons
    JButton Calculate = new JButton("Calculate");
    JButton Clear = new JButton("Clear");
    JLabel Total = new JLabel("Total: ");
    JTextField TotalResult = new JTextField(8);
    // variables used to calculate total
    double TotalCost = 50;
    public FlightCalculator() {
        // layout north portion of frame
        northPanel.setLayout(new GridLayout(2, 3));
        northPanel.setBorder(new TitledBorder("Flight destination and flight Type:"));
        // register listeners with buttons
        Ireland.addActionListener(this);
        Europe.addActionListener(this);
        US.addActionListener(this);
        Asia.addActionListener(this);
        Africa.addActionListener(this);
        Australia.addActionListener(this);

        Calculate.addActionListener(this);
        JRadioButton Ireland = new JRadioButton("Ireland");
        JRadioButton Europe = new JRadioButton("Europe");
        JRadioButton US = new JRadioButton("US");
        JRadioButton Asia = new JRadioButton("Asia");
        JRadioButton Africa = new JRadioButton("Africa");
        JRadioButton Australia = new JRadioButton("Australia");
        ButtonGroup flightDestination = new ButtonGroup();
        flightDestination.add(Ireland);
        flightDestination.add(Europe);
        flightDestination.add(US);
        flightDestination.add(Asia);
        flightDestination.add(Africa);
        flightDestination.add(Australia);

        ButtonGroup flightType = new ButtonGroup();
        flightDestination.add(Business);
        
        // add buttons to north panel
        northPanel.add(new JTextField("Flight Total Calculator"));
        northPanel.add(Ireland);
        northPanel.add(Europe);
        northPanel.add(US);
        northPanel.add(Asia);
        northPanel.add(Africa);
        northPanel.add(Australia);

        centerPanel.setLayout(new GridLayout(5, 5));
        centerPanel.setBorder(new TitledBorder("Flight Type:"));
        centerPanel.add(Business);
        southPanel.add(Calculate);
        southPanel.add(Clear);
        southPanel.add(Total);
        southPanel.add(TotalResult);
        // add all portions of panel
        setLayout(new BorderLayout(5, 5));
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }
    // handle action event for each pizza option
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Ireland)
            TotalCost= TotalCost+0;
        else if (e.getSource() == Europe)
            TotalCost = TotalCost* 2;
        else if (e.getSource() == US)
            TotalCost = TotalCost* 6;
        else if (e.getSource() == Asia)
            TotalCost = TotalCost* 5;
        else if (e.getSource() == Africa)
            TotalCost = TotalCost* 5;
         else if (e.getSource() == Australia)
            TotalCost = TotalCost* 8;
        if (e.getSource() == Business)
            TotalCost = TotalCost* 2;
        if (e.getSource() == Calculate)
            TotalCost = TotalCost;
            
            }
    
    public void calculate() {
        TotalCost = TotalCost;
        TotalResult.setText(String.valueOf(TotalCost));
    }
    public static void main(String[] args) {
        FlightCalculator FlightCalc = new FlightCalculator();
        // set window title
        FlightCalc.setTitle("Flight Cost Calculator");
        // set window location
        FlightCalc.setLocationRelativeTo(null);
        // specify window location
       
        // set window size
        FlightCalc.setSize(800, 250);
        // display window
        FlightCalc.setVisible(true);
    }
}