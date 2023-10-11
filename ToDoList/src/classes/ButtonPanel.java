package classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clear;
    Border emptyBorder = BorderFactory.createEmptyBorder();

    public ButtonPanel() {
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(Colors.TITLEBAR.getColor());

        addTask = new JButton();
        addTask.setBorder(emptyBorder);
        addTask.setFont(Fonts.BITSTREAM.getFont());
        addTask.setPreferredSize(new Dimension(100,40));
        addTask.setBackground(Colors.TITLEBAR.getColor());
        addTask.setIcon(new ImageIcon("src/img/addTask1.png"));



        this.add(addTask);

    }
}
