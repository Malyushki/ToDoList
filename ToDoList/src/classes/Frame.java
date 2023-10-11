package classes;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private ButtonPanel buttonPanel;
    private TitleBar titleBar;
    private List list;
    public Frame() {
        this.setSize(400,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        titleBar = new TitleBar();
        list = new List();
        buttonPanel = new ButtonPanel();
        this.add(titleBar, BorderLayout.NORTH);

        this.add(buttonPanel,BorderLayout.SOUTH);

        revalidate();
    }
}
