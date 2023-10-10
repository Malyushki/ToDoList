package classes;

import java.awt.*;

public enum Colors {
    BACKGROUND(new Color(244, 211, 94)),
    TEXT(new Color(25, 25, 25)),
    BUTTON(new Color(0, 108, 103)),
    TITLEBAR(new Color(0, 184, 174));

    private Color color;

    private Colors(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
