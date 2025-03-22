package phones.tags;

import phones.Phone;

public class PriceLowTag extends Tag {

    double price;

    public PriceLowTag(double price) {
        this.price = price;
    }

    @Override
    public boolean find(Phone phone) {
        return price > phone.getPrice();
    }
}
