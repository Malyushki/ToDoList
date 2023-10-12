package classes;

import java.awt.*;

public enum Colors {
    BACKGROUND(new Color(244, 211, 94)),
    TITLEBAR(new Color(54, 133, 140)),
    DONETASK(new Color(27, 154, 132)),
    FONT_COLOR(new Color(255, 255, 255));

    private Color color;

    private Colors(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
