package HW;

public class HW_5 {

    public static void main(String[] args) {
        DoubleBox<String> box = new DoubleBox<>();
        System.out.println("111 -> " + box.get(111)); // null
        System.out.println("SIZE: " + box.size()); // 0
        System.out.println();

        System.out.println("PUT: " + box.put(111, "First string")); // true
        System.out.println("111 -> " + box.get(111)); // First string
        System.out.println("111 -> " + box.get(22)); // null
        System.out.println("111 -> " + box.get(3333)); // null
        System.out.println("SIZE: " + box.size()); // 1
        System.out.println();

        System.out.println("PUT: " + box.put(22, "Second string")); // true
        System.out.println("111 -> " + box.get(111)); // First string
        System.out.println("111 -> " + box.get(22)); // Second string
        System.out.println("111 -> " + box.get(3333)); // null
        System.out.println("SIZE: " + box.size()); // 2
        System.out.println();

        System.out.println("PUT: " + box.put(3333, "First string")); // false
        System.out.println("111 -> " + box.get(111)); // First string
        System.out.println("111 -> " + box.get(22)); // Second string
        System.out.println("111 -> " + box.get(3333)); // null
        System.out.println("SIZE: " + box.size()); // 2
    }
}


class RandomBox<T> {
    private int key;
    private T value;

    public RandomBox(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public T tryUnlock(int key) {
        if (this.key == key) {
            return value;
        } else {
            return null;
        }
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}


class DoubleBox<T> {
    private RandomBox<T> first;
    private RandomBox<T> second;
    private int col = 0;

    public boolean put(int key, T value) {

        if (col == 2) {
            return false;
        } else if (col == 0) {
            RandomBox<T> random = new RandomBox<>(key, value);
            first = random;
            System.out.println(first.getKey());
            System.out.println(first.getValue());
            col++;
            return true;
        } else {
            RandomBox<T> random = new RandomBox<>(key, value);
            second = random;
            System.out.println(second.getKey());
            System.out.println(second.getValue());
            col++;
            return true;
        }
    }

    public T get(int key) {
        if (first != null) {
            if (first.getKey() == key) {
                return first.getValue();
            }
        }
        if (second != null) {
            if (second.getKey() == key) {
                return second.getValue();
            }
        }
        return null;
    }

    public int size() {
        return col;
    }
}
