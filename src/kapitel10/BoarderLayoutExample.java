package kapitel10;

import javax.swing.*;
import java.awt.*;

public class BoarderLayoutExample extends JFrame {

    private BoarderLayoutExample(){
        super("BoarderLayout Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton northButton = new JButton("North");
        JButton northButton2 = new JButton("North 2");
        northPanel.add(northButton);
        northPanel.add(northButton2);

        JButton southButton = new JButton("South");
        JButton westButton = new JButton("West");
        JButton eastButton = new JButton("East");

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton centerButton = new JButton("Center");
        centerPanel.add(centerButton);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(southButton, BorderLayout.SOUTH);
        this.add(westButton, BorderLayout.WEST);
        this.add(eastButton, BorderLayout.EAST);
        this.add(centerPanel, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BoarderLayoutExample();
    }



}
