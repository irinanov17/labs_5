package phones.tags;

import phones.Phone;
import java.awt.Color;

public class ColorTag extends Tag {

    Color color;

    public ColorTag(Color color) {
        this.color = color;
    }

    @Override
    public boolean find(Phone phone) {
       return color.equals(phone.getColor());
    }
}
