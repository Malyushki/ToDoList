package classes;
import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel{

    public TitleBar() {
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(Colors.TITLEBAR.getColor());

        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200,80));
        titleText.setFont(Fonts.BITSTREAM.getFont());
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);

    }
}
