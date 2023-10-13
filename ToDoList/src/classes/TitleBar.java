package classes;
import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel{

    public TitleBar() {
        this.setPreferredSize(new Dimension(400,160));
        this.setBackground(Colors.TITLEBAR.getColor());


        JLabel titleText = new JLabel();
        titleText.setPreferredSize(new Dimension(400,160));
        titleText.setIcon(new ImageIcon(getClass().getClassLoader().getResource("todoList.png")));
        titleText.setHorizontalAlignment(JLabel.CENTER);


        this.add(titleText);

    }
}
