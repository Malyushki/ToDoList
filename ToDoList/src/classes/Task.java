package classes;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    private JLabel index;
    private JTextField taskName;
    private JButton done;

    private boolean isCompleted;

    public Task() {
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(Color.LIGHT_GRAY);

        this.setLayout(new BorderLayout());
        isCompleted = false;
        index = new JLabel();
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);

        taskName = new JTextField("Your task here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.GRAY);

        this.add(taskName,BorderLayout.CENTER);

        done = new JButton("done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());

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
        this.setBackground(Color.GREEN);
        taskName.setBackground(Color.GREEN);
        isCompleted = true;
    }

    public JButton getDone(){
        return done;
    }


}
