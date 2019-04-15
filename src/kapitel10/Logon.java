package kapitel10;


import java.awt.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Logon extends JFrame{

    public Logon(){

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

        JFormattedTextField portField = null;
        try {
            portField = new JFormattedTextField(new MaskFormatter("#####"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //create & assign elements for connection area
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("User:")));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JTextField(5)));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Passwort:")));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JPasswordField(7)));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Art:")));
        connectionPanel.add(new JPanel(new FlowLayout()).add(myComboBox));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Host:")));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JTextField(7)));
        connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Port:")));
        connectionPanel.add(new JPanel(new FlowLayout()).add(portField));


        // create & add Fields for File Area
        filePanel.add(new JPanel(new FlowLayout()).add(new JLabel("Quelle:")));
        filePanel.add(new JPanel(new FlowLayout()).add(new JTextField(10)));
        filePanel.add(new JPanel(new FlowLayout()).add(new JLabel("Ziel:")));
        filePanel.add(new JPanel(new FlowLayout()).add(new JTextField(7)));

        // create & assign Buttons
        JButton okButton = new JButton("Ok");
        JButton cancelButton = new JButton("Cancel");


        southPanel.add(okButton);
        southPanel.add(cancelButton);


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

    public static void main(String[] args){
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("Screen Dimension: " + screenDimension.getWidth() + " x " + screenDimension.getHeight());

        new Logon();
    }

}
