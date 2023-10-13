package classes;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class Task extends JPanel {
    private JLabel index;
    private JTextField taskName;
    private JButton done;

    private boolean isCompleted;

    public Task() {
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(Colors.TITLEBAR.getColor());
        this.setLayout(new BorderLayout());
        isCompleted = false;
        index = new JLabel();
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setFont(Fonts.BITSTREAM.getFont());
        index.setForeground(Colors.FONT_COLOR.getColor());
        this.add(index,BorderLayout.WEST);

        taskName = new JTextField("Your task here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Colors.TITLEBAR.getColor());
        taskName.setFont(Fonts.BITSTREAM.getFont());
        taskName.setForeground(Colors.FONT_COLOR.getColor());

        this.add(taskName,BorderLayout.CENTER);

        done = new JButton();
        done.setPreferredSize(new Dimension(40,20));
        done.setIcon(new ImageIcon(getClass().getClassLoader().getResource("done1.png")));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setBackground(Colors.BACKGROUND.getColor());
        this.add(done,BorderLayout.EAST);
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void changeIndex(int index){
        this.index.setText(String.valueOf(index));
        this.revalidate();

    }

    public void changeState(){
        this.setBackground(Colors.DONETASK.getColor());
        taskName.setBackground(Colors.DONETASK.getColor());
        done.setIcon(new ImageIcon(getClass().getClassLoader().getResource("done2.png")));
        isCompleted = true;
    }

    public JButton getDone(){
        return done;
    }


}
