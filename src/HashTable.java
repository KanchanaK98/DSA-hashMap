public class HashTable {
    private int size;
    private Node[] table;

    public HashTable(int size) {
        this.size = size;
        table = new Node[size];
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void insert(int key) {
        int index = hashFunction(key);
        Node newNode = new Node(key);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int key) {
        int index = hashFunction(key);
        Node current = table[index];
        Node prev = null;
        while (current != null && current.key != key) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            if (prev != null) {
                prev.next = current.next;
            } else {
                table[index] = current.next;
            }
        }
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            Node current = table[i];
            while (current != null) {
                System.out.print(current.key + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}