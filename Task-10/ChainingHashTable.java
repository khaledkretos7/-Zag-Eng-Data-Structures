import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ChainingHashTable {
    private class Node {
        private int key;
        private String value;
        private int integer;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public Node(int key, int integer) {
            this.key = key;
            this.integer = integer;
        }
    }

    private int count;
    private LinkedList<Node>[] hashTable;

    public ChainingHashTable(int size) {
        hashTable = new LinkedList[size];
        count = 0;
    }

    private int hash(int key) {
        return key % hashTable.length;
    }

    public void put(int key, String value) {
        int index = hash(key);

        if (nullIndex(key)) {
            hashTable[index] = new LinkedList<>();
        }

        for (Node e : hashTable[index]) {
            if (e.key == key) {
                e.value = value;
                return;
            }
        }

        hashTable[index].add(new Node(key, value));
        count++;
    }

    public void integerValue(int key) {
        int index = hash(key);

        if (nullIndex(key)) {
            hashTable[index] = new LinkedList<>();
        }

        for (Node e : hashTable[index]) {
            if (e.key == key) {
                e.integer++;
                return;
            }
        }

        hashTable[index].add(new Node(key, 1));
        count++;
    }

    public String get(int key) {
        int index = hash(key);

        if (nullIndex(key))
            return null;

        else
            for (Node e : hashTable[index]) {
                if (e.key == key)
                    return e.value;
            }

        return null;
    }

    public int getinteger(int key) {
        int index = hash(key);

        if (nullIndex(key))
            return 0;

        else
            for (Node e : hashTable[index]) {
                if (e.key == key)
                    return e.integer;
            }

        return 0;
    }

    public void remove(int key) {
        int index = hash(key);

        if (nullIndex(key))
            throw new NoSuchElementException("Not Exisit");

        else
            for (Node e : hashTable[index])
                if (e.key == key) {
                    hashTable[index].remove(e);
                    count--;
                    return;
                }
        throw new NoSuchElementException("Not Exisit");
    }

    public int size() {
        return count;
    }

    public boolean nullIndex(int key) {
        int index = hash(key);
        return hashTable[index] == null;
    }
}