package CollectionsSamples;

import java.util.ArrayList;
import java.util.Scanner;

public class HashMapSamples {
    public static void main(String[] args) {
        speedTest();
//        typicalUsage();
    }

    static void typicalUsage() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // Create new ArrayList with initial capacity
        ArrayList<Integer> numbers = new ArrayList<>(size);
        // or reserve space with this method
        numbers.ensureCapacity(size);

        // add element
        numbers.add(177);

        // fill list with values from console
        for (int i = 0; i < size - 1; i++) {
            int temp = sc.nextInt();
            numbers.add(temp);
        }

        // input: 4 10 20 30
        System.out.println(numbers); // [177, 10, 20, 30]
        System.out.println(numbers.get(0)); // 177
    }

    // Shows that it's important to ensure capacity of array if you know it!
    static void speedTest() {
        long start = System.currentTimeMillis();
        ArrayList<Integer> first = new ArrayList<>(100_000_000);
        for (int i = 0; i < 100_000_000; i++) {
            first.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.printf("Array with predefined capacity wall time : %d ms\n", finish - start);
        // out: 4K

        start = System.currentTimeMillis();
        ArrayList<Integer> second = new ArrayList<>();
        for (int i = 0; i < 100_000_000; i++) {
            second.add(i);
        }
        finish = System.currentTimeMillis();
        System.out.printf("Array without predefined capacity wall time : %d ms\n", finish - start);
        // out: 11K
    }
}
