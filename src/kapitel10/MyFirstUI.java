package kapitel10;

import javax.swing.*;
import java.awt.*;

public class MyFirstUI {

    public static void main(String[] args) {

        JFrame myFrame = new JFrame("My first UI");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel myTextField = new JLabel("Hello UI!");
        JButton myButton = new JButton("Drück mich");

        myFrame.setLayout(new FlowLayout(FlowLayout.CENTER));

        myFrame.add(myTextField);
        myFrame.add(myButton);

        // get Content Pane
        //myFrame.getContentPane();

        myFrame.setBounds(100, 100, 300, 200);

        myFrame.setVisible(true);
        //myFrame.pack();

    }
}
