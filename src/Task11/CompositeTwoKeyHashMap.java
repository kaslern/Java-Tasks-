package Task11;

import java.util.*;

public class CompositeTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {

    private final Map<Pair<K1, K2>, V> internalMap = new HashMap<>();

    @Override
    public V put(K1 k1, K2 k2, V value) {
        Objects.requireNonNull(k1, "Key1 cannot be null");
        Objects.requireNonNull(k2, "Key2 cannot be null");
        Objects.requireNonNull(value, "Value cannot be null");

        Pair<K1, K2> pairKey = new Pair<>(k1, k2);

        return internalMap.put(pairKey, value);
    }


    @Override
    public V get(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "Key1 cannot be null");
        Objects.requireNonNull(k2, "Key2 cannot be null");

        Pair<K1, K2> pairKey = new Pair<>(k1, k2);

        return internalMap.get(pairKey);
    }

    @Override
    public V remove(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "Key1 cannot be null");
        Objects.requireNonNull(k2, "Key2 cannot be null");

        Pair<K1, K2> pairKey = new Pair<>(k1, k2);

        return internalMap.remove(pairKey);
    }

    @Override
    public boolean containsKeys(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "Key1 cannot be null");
        Objects.requireNonNull(k2, "Key2 cannot be null");

        Pair<K1, K2> pairKey = new Pair<>(k1, k2);

        return internalMap.containsKey(pairKey);
    }

    @Override
    public boolean containsValue(V value) {
        Objects.requireNonNull(value, "Value cannot be null");

        return internalMap.containsValue(value);
    }

    @Override
    public int size() {
        return internalMap.size();
    }

    @Override
    public boolean isEmpty() {
        return internalMap.isEmpty();
    }

    @Override
    public Set<Entry<K1, K2, V>> entrySet() {
        Set<Entry<K1, K2, V>> result = new HashSet<>();

        for (Map.Entry<Pair<K1, K2>, V> internalEntry : internalMap.entrySet()) {
            K1 key1 = internalEntry.getKey().keyOne();
            K2 key2 = internalEntry.getKey().keyTwo();
            V value = internalEntry.getValue();

            result.add(new SimpleEntry(key1, key2, value));
        }
        return result;
    }

    @Override
    public Collection<V> values() {
        return internalMap.values();
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        return internalMap.keySet();
    }

    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {
        Objects.requireNonNull(other, "Other map cannot be null");

        for (TwoKeyMap.Entry<? extends K1, ? extends K2, ? extends V> entry : other.entrySet()) {
            K1 key1 = entry.getKey1();
            K2 key2 = entry.getKey2();
            V value = entry.getValue();

            this.put(key1, key2, value);
        }
    }

    @Override
    public void clear() {
        internalMap.clear();;
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return entrySet().iterator();
    }

    @Override
    public String toString() {
        return "CompositeTwoKeyHashMap{" +
                "internalMap=" + internalMap +
                '}';
    }

    private class SimpleEntry implements TwoKeyMap.Entry<K1, K2, V> {
        private final K1 k1;
        private final K2 k2;
        private V value;

        public SimpleEntry(K1 k1, K2 k2, V value) {
            this.k1 = k1;
            this.k2 = k2;
            this.value = value;
        }

        @Override public K1 getKey1() { return k1; }
        @Override public K2 getKey2() { return k2; }
        @Override public V getValue() { return value; }
        @Override public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }
}