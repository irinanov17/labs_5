package phones.tags;

import phones.Phone;

public class ModelTag extends Tag {

    String model;

    public ModelTag(String model) {
        this.model = model;
    }

    @Override
    public boolean find(Phone phone) {
        return model.equals(phone.getModel());
    }
}
