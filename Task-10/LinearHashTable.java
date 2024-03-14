import java.util.NoSuchElementException;

public class LinearHashTable {
    private class Node {
        private int key;
        private String value;
        private int Integer;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
        public Node(int key, int Integer) {
            this.key = key;
            this.Integer = Integer;
        }
    }

    private int count;
    Node[] hashTable;

    public LinearHashTable(int size) {
        hashTable = new Node[size];
        count = 0;
    }

    private int hash(int key) {
        return key % hashTable.length;
    }

    public void IntegerValue (int key) {
        if (isFull())
            throw new NoSuchElementException("hash is full");

        int index = hash(key);
        if (nullIndex(key)) {
            hashTable[index] = new Node(key,1);
            count++;
            return;
        }

        while (!nullIndex(key)) {
            if (hashTable[index].key == key) {
                hashTable[index].Integer++;
                return;
            }
            index = (index + 1) % hashTable.length;
        }

        hashTable[index] = new Node(key, 1);
        count++;

    }

    public void putValue(int key, String value) {
        if (isFull())
            throw new NoSuchElementException("hash is full");

        int index = hash(key);
        while (hashTable[index] != null && hashTable[index].key != key) {
            index = (index + 1) % hashTable.length;
        }

        hashTable[index] = new Node(key, value);
        count++;

    }

    public String getValue(int key) {
        if (isEmpty())
            throw new NoSuchElementException("hash is empty");

        int index = hash(key);

        while (!nullIndex(key)) {
            if (hashTable[index].key == key) {
                return hashTable[index].value;
            }
            index = (index + 1) % hashTable.length;
        }

        return null;
    }

    public int getInteger(int key) {
        if (isEmpty())
            throw new NoSuchElementException("hash is empty");

        int index = hash(key);

        while (!nullIndex(key)) {
            if (hashTable[index].key == key) {
                return hashTable[index].Integer;
            }
            index = (index + 1) % hashTable.length;
        }

        return 0;
    }

    public void remove(int key) {
        if (isEmpty())
            throw new NoSuchElementException("hash is empty");

        int index = hash(key);

        while (!(hashTable[index] == null)) {
            if (hashTable[index].key == key) {
                hashTable[index] = null;
                count--;
                return;
            }
            index = (index + 1) % hashTable.length;
        }
    }

    public int size () {
        return count;
    }

    public boolean nullIndex (int key){
        int index = hash(key);
        return hashTable[index] == null;
    }

    private boolean isFull() {
        return count == hashTable.length;
    }

    private boolean isEmpty() {
        return count == 0;
    }
}