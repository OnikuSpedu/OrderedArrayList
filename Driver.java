public class Driver {
    public static void main(String[] args) {
        NoNullArrayListTester();
        OrderedArrayListTester();
    }

    public static void NoNullArrayListTester() {
        NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();
        Integer[] testNums = {0, 1, 2, 3, 4, 9, 2, null};
        for (int i = 0; i < testNums.length; i++) {
            try {
                a.add(testNums[i]);
                System.out.println(testNums[i] + " added.");
                System.out.println(a);
            } catch (Exception e) {
                System.out.println(i + " is null.");
            }
        }
        try {
            a.add(6, 6);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at add(index, element) test #1");
        }
        try {
            a.add(100, 100);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at add(index, element) test #2");
        }
        try {
            a.add(-1, 100);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at add(index, element) test #3");
        }
        try {
            a.set(6, 7);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at set(index, element) test #1");
        }
        try {
            a.set(100, 100);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at set(index, element) test #2");
        }
        try {
            a.set(-1, 100);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at set(index, element) test #3");
        }
    }
    public static void OrderedArrayListTester() {
        OrderedArrayList<Integer> a = new OrderedArrayList<Integer>();
        Integer[] testNums = {0, 1, 2, 3, 4, 9, 2, null};
        for (int i = 0; i < testNums.length; i++) {
            try {
                a.add(testNums[i]);
                System.out.println(testNums[i] + " added.");
                System.out.println(a);
            } catch (Exception e) {
                System.out.println("Index " + i + " is null.");
            }
        }
        try {
            a.add(6, 6);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at add(index, element) test #1");
        }
        try {
            a.add(100, 100);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at add(index, element) test #2");
        }
        try {
            a.add(-1, 100);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at add(index, element) test #3");
        }
        try {
            a.set(6, 7);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at set(index, element) test #1");
        }
        try {
            a.set(100, 100);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at set(index, element) test #2");
        }
        try {
            a.set(-1, 100);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception at set(index, element) test #3");
        }
    }
}