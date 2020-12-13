import java.util.ArrayList;
class NoNullArrayList<T> extends ArrayList<T> {
    public NoNullArrayList() {
        super();
    }
    public NoNullArrayList(int startingCapacity) {
        super(startingCapacity);
    }
    
    public boolean add(T e) {
        if(e == null) {
            throw new IllegalArgumentException("No nulls allowed.");
        } else {
            return super.add(e);
        }
    }
    
    public void add(int index, T element) {
        if(element != null) {
        super.add(index, element);
        } else  {
            throw new IllegalArgumentException("No nulls allowed.");
        }
    }
    
    public T set(int index, T element) {
        if(element != null) {
            return super.set(index, element);
        } else {
            throw new IllegalArgumentException("No nulls allowed.");
        }
    }
}