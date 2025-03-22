package phones.tags;

import phones.Phone;

public class MemorySizeTag extends Tag {

    int size;

    public MemorySizeTag(int size) {
        this.size = size;
    }

    @Override
    public boolean find(Phone phone) {
        return size == phone.getMemorySize();
    }
}
