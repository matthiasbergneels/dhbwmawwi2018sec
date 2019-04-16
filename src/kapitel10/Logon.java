package kapitel10;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Logon extends JFrame{

    private static final String COMMAND_OK = "OK";
    private static final String COMMAND_CLOSE = "CLOSE";

    private JTextField host;

    public Logon() throws ParseException{

        this.setTitle("Logon");

        String[] valueHelp = {"FTP", "Telnet", "SMTP", "HTTP"};
        JComboBox<String> myComboBox = new JComboBox<String>(valueHelp);


        // initialize Panels
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());

        ((FlowLayout)centerPanel.getLayout()).setHgap(20);
        ((FlowLayout)centerPanel.getLayout()).setVgap(20);


        JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
        JPanel filePanel = new JPanel(new GridLayout(0, 2));

        ((GridLayout)connectionPanel.getLayout()).setVgap(15);
        ((GridLayout)filePanel.getLayout()).setVgap(15);

        final JFormattedTextField portField = new JFormattedTextField(new MaskFormatter("#####"));

        //create & assign elements for connection area
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("User:")));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JTextField(5)));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Passwort:")));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JPasswordField(7)));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Art:")));
        connectionPanel.add(new JPanel(new FlowLayout()).add(myComboBox));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Host:")));

        host = new JTextField(7);
        connectionPanel.add(new JPanel(new FlowLayout()).add(host));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Port:")));
        connectionPanel.add(new JPanel(new FlowLayout()).add(portField));


        // create & add Fields for File Area
        filePanel.add(new JPanel(new FlowLayout()).add(new JLabel("Quelle:")));
        filePanel.add(new JPanel(new FlowLayout()).add(new JTextField(10)));
        filePanel.add(new JPanel(new FlowLayout()).add(new JLabel("Ziel:")));
        filePanel.add(new JPanel(new FlowLayout()).add(new JTextField(7)));

        // create & assign Buttons
        JButton okButton = new JButton("Okay");
        okButton.setActionCommand(COMMAND_OK);
        JButton cancelButton = new JButton("Schliessen");
        cancelButton.setActionCommand(COMMAND_CLOSE);
        JButton ok2Button = new JButton("Noch Okayer");
        ok2Button.setActionCommand(COMMAND_OK);

        JFormattedTextField finalPortField = portField;

        /*
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(COMMAND_OK)) {                //if(e.getSource() == okButton) {
                    System.out.println(e.getActionCommand());
                    System.out.println(e.getModifiers());
                    System.out.println("Aktuelle Auswahl des Protokolls: " + myComboBox.getSelectedItem());
                    if (myComboBox.getSelectedItem().equals("FTP")) {
                        portField.setText("21");
                    }
                    host.setText("google.de");
                }else if (e.getActionCommand().equals(COMMAND_CLOSE)){        //}else if(e.getSource() == cancelButton){
                    System.exit(0);
                }
            }
        };
        */

        ActionListener buttonListener = e -> {
            if (e.getActionCommand().equals(COMMAND_OK)) {
                System.out.println(e.getActionCommand());
                System.out.println(e.getModifiers());
                System.out.println("Aktuelle Auswahl des Protokolls: " + myComboBox.getSelectedItem());
                if (myComboBox.getSelectedItem().equals("FTP")) {
                    portField.setText("21");
                }
                host.setText("google.de");
            } else if (e.getActionCommand().equals(COMMAND_CLOSE)){
                System.exit(0);
            }
        };

        /*
        ItemListener comboBoxListener  = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {


                System.out.println("Combo Box geändert");
                System.out.println(e.getStateChange());
                System.out.println(e.getItem());
                if(e.getStateChange() == 1) {
                    if (e.getItem().equals("FTP")) {
                        portField.setText("21");
                    } else {
                        portField.setText("");
                    }
                }

            }
        };
        */


        

        myComboBox.addItemListener(e -> System.out.println((e.getStateChange() == 1) ? ("Selected Item: " + e.getItem()) : ""));

        okButton.addActionListener(buttonListener);
        cancelButton.addActionListener(buttonListener);
        ok2Button.addActionListener(buttonListener);


        southPanel.add(okButton);
        southPanel.add(cancelButton);
        southPanel.add(ok2Button);


        // create & assign Borders
        Border etchedBorder = BorderFactory.createEtchedBorder();
        Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
        Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
        Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

        connectionPanel.setBorder(connectionBorder);
        filePanel.setBorder(fileBorder);
        centerPanel.setBorder(centerBorder);

        // combine Panels
        centerPanel.add(connectionPanel);
        centerPanel.add(filePanel);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        this.setContentPane(mainPanel);

        // set JFrame behavior
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) throws ParseException {
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("Screen Dimension: " + screenDimension.getWidth() + " x " + screenDimension.getHeight());

        new Logon();
    }

}
