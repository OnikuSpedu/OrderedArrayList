public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
        super();
    }
    public OrderedArrayList(int startingCapacity) {
        super(startingCapacity);
    }

    public boolean add(T value) {
        if (value == null) {
            throw new IllegalArgumentException("No nulls allowed.")
        } else {

            for (int i = 0; i < size(); i++) {
                if (value.compareTo(this.get(i)) <= 0) {
                    super.add(i, value);
                    return true;
                }
            }
            
            super.add(value);
            return true;
        }
    }
}