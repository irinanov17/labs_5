package phones;

import phones.tags.*;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

public class FindPhone {
    private List<Phone> data=new PhoneDB().getPhoneData();

    public List<Phone> byColor(Color col) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data)
        {
            var colorTag = new ColorTag(col);

            if(colorTag.find(ph))
                find.add(ph);
        }
        return find;
    }

    public List<Phone> byModel(String mod) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data)
        {
            var model = new ModelTag(mod);

            if(model.find(ph))
                find.add(ph);
        }
        return find;
    }

    public List<Phone> byMSize(int memSize) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data) {
            var memorySizeTag = new MemorySizeTag(memSize);

            if(memorySizeTag.find(ph))
                find.add(ph);
        }
        return find;
    }

    public List<Phone> byModelAndPriceLow(String mod, double price) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data)
        {
            var model = new ModelTag(mod);
            var priceLow = new PriceLowTag(price);

            if(model.find(ph) && priceLow.find(ph))
                find.add(ph);
        }
        return find;
    }

    public List<Phone> byMSizeAndNotColor(int memSize, Color col) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data) {
            var memorySizeTag = new MemorySizeTag(memSize);
            var colorTag = new ColorTag(col);
            if(memorySizeTag.find(ph) && colorTag.find(ph) == false)
                find.add(ph);
        }
        return find;
    }    
}
