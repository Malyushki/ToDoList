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

        clear = new JButton();
        clear.setBorder(emptyBorder);
        clear.setFont(Fonts.BITSTREAM.getFont());
        clear.setPreferredSize(new Dimension(100,40));
        clear.setBackground(Colors.TITLEBAR.getColor());
        clear.setIcon(new ImageIcon("ToDoList/src/img/addTask1.png"));
        this.add(clear);

        addTask = new JButton();
        addTask.setBorder(emptyBorder);
        addTask.setFont(Fonts.BITSTREAM.getFont());
        addTask.setPreferredSize(new Dimension(100,40));
        addTask.setBackground(Colors.TITLEBAR.getColor());
        addTask.setIcon(new ImageIcon("ToDoList/src/img/addTask1.png"));
        this.add(addTask);

    }
}
