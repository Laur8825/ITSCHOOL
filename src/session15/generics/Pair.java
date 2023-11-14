package session15.generics;

public class Pair <K,V> {

    private K key;
    private V Value;

    public Pair(K key, V value) {
        this.key = key;
        Value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return Value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair= new Pair<>("Alice", 23);
        System.out.println(pair.getKey() + " is " + pair.getValue() + " years old.");
    }
}
