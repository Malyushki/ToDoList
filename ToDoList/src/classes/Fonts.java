package classes;

import java.awt.*;

public enum Fonts {
    BITSTREAM(new Font("Bitstream Vera Sans Mono", Font.BOLD, 20));

    private Font font;

    private Fonts(Font font) {
        this.font = font;
    }

    public Font getFont() {
        return font;
    }
}
