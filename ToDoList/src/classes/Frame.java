package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {
    private ButtonPanel buttonPanel;
    private TitleBar titleBar;
    private List list;

    private JButton addTask;
    private JButton clear;

    public Frame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        titleBar = new TitleBar();
        list = new List();
        buttonPanel = new ButtonPanel();
        this.add(titleBar, BorderLayout.NORTH);

        this.add(buttonPanel, BorderLayout.SOUTH);

        this.add(list, BorderLayout.CENTER);

        addTask = buttonPanel.getAddTask();
        clear = buttonPanel.getClear();

        addListeners();

        revalidate();
    }

    public void addListeners() {
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
               if (list.getComponentCount()>=10){
                 return;
               }

                Task task = new Task();
                list.add(task);
                list.countTasks();

                task.getDone().addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {

                        task.changeState();
                        revalidate();
                    }

                });

                revalidate();
            }
        });
        clear.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                list.removeCompletedTasks();
                repaint();
            }
        });
    }

}
