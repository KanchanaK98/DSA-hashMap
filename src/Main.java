public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5);

        int[] numbers = {5, 10, 20, 1, 0, 100, 13, 21};
        for (int num : numbers) {
            hashTable.insert(num);
        }


        System.out.println("Hash Table with all numbers inserted:");
        hashTable.printTable();

        hashTable.remove(100);

        System.out.println("\nHash Table after removing number 100:");
        hashTable.printTable();
    }

}