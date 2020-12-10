import java.util.ArrayList;
class NoNullArrayList<T> extends ArrayList<T> {
    public NoNullArrayList() {
        super();
    }
    public NoNullArrayList(int startingCapacity) {
        super(startingCapacity);
    }
    @Override
    public boolean add(T e) {
        if(e == null) {
            return false;
        } else {
            return super.add(e);
        }
    }
    @Override
    public void add(int index, T element) {
        if(element != null) {
        super.add(index, element);
        }
    }
    @Override
    public T set(int index, T element) {
        if(element != null) {
            return super.set(index, element);
        } else {
            return null;
        }
    }
}