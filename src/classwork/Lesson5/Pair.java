package classwork.Lesson5;

public class Pair<K,V> {
    private K key;
    private V value;

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;

    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
