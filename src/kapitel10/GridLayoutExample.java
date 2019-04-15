package kapitel10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    private GridLayoutExample() {
        super("GridLaout Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(0, 2));

        JPanel panelCell1 = new JPanel(new FlowLayout());
        JButton buttonCell1 = new JButton("Cell 1");
        panelCell1.add(buttonCell1);

        JButton buttonCell2 = new JButton("Cell 2");
        JButton buttonCell3 = new JButton("Cell 3");
        JButton buttonCell4 = new JButton("Cell 4");
        JButton buttonCell5 = new JButton("Cell 5");
        JButton buttonCell6 = new JButton("Cell 6");
        JButton buttonCell7 = new JButton("Cell 7");

        this.add(panelCell1);
        this.add(buttonCell2);
        this.add(buttonCell3);
        this.add(buttonCell4);
        this.add(buttonCell5);
        this.add(buttonCell6);
        this.add(buttonCell7);


        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }

}
