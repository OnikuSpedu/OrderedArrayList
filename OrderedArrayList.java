import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
        super();
    }
    public OrderedArrayList(int startingCapacity) {
        super(startingCapacity);
    }

    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("No nulls allowed.")
        } else {

            for (int i = 0; i < this.size(); i++) {
                if (element.compareTo(this.get(i)) <= 0) {
                    super.add(i, element);
                    return true;
                }
            }

            super.add(element);
            return true;
        } 
    }

    
    public void add(int index, T element) {
        this.add(element);
    }

    public T set(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException("No nulls allowed.")
        } else {
            T old = this.get(index);
            this.remove(element);
            return old;
        }
    }
}