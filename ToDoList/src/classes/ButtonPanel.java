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
        addTask.setPreferredSize(new Dimension(120,40));
        addTask.setBackground(Colors.TITLEBAR.getColor());
        addTask.setIcon(new ImageIcon(getClass().getClassLoader().getResource("addTask1.png")));

        this.add(addTask);

        clear = new JButton();
        clear.setBorder(emptyBorder);
        clear.setFont(Fonts.BITSTREAM.getFont());
        clear.setPreferredSize(new Dimension(215,40));
        clear.setBackground(Colors.TITLEBAR.getColor());
        clear.setIcon(new ImageIcon(getClass().getClassLoader().getResource("clearCompletedTasks1.png")));
        this.add(clear);

    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClear() {
        return clear;
    }
}
