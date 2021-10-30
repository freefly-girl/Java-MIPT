package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

//        inputScanner(); // input: 3 10 20 30 {40 50} -> 60.0
//        Char(); // π
//        Cycles(7); // 0 1 2 10
//        Branches(777); // b != 100 -> b = 777
//        Branches(5); // false
//        Literals(); // -10.0
//        PrimitiveTypesDemo(); // -Infinity
//        arrays();
    }

//    psvm + enter -> public static void main(String[] args) {}

//    Static fields do not depend on class instance
    static int a = 4;

//    Non-static fields depend on class instance
    int b = 3;

//    Static methods can't access non-static fields
    public static void printA(String word) {
        System.out.println(word);
    }

    static void PrimitiveTypesDemo() {
        int a = 100;

        // long b = 1000000000; //not OK
        long c = 10000000000L; // OK

        long underscore = 1_000_000L; // 1000000
        int oct = 010; // 8
        int hex = 0x10; // 16
        System.out.println(hex);
    }

    static void TypesCast() {
        int a = 500;
        double b = a;

        int c = (int)b;
        System.out.println(b); // 500.0
        System.out.println(c); // 500
    }

    static void Literals() {
        double inf = Double.POSITIVE_INFINITY;
        double minus_inf = Double.NEGATIVE_INFINITY;
        double nan = Double.NaN;

        System.out.println(2.0 - 12.); // -10.0
        System.out.println(minus_inf); // -Infinity
    }

    static void Branches(int b) {
//        int b = 100;

        switch (b){
            case 100:
                System.out.println("b = 100");
                break;
            case 777:
                System.out.println("b != 100 -> b = " + b);
                break;
            default:
                System.out.println(false);
        }
    }

    static void Cycles(int k) {

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        while (k > 2) {
            k++;
        }

        do {
            k++;
        } while (k < 10);
        System.out.println(k);
    }

    static void Char() {
        // 10-bit UTF-16
        char ch = '\u03C0'; // pi number code
        System.out.println(ch);
    }

    static void inputScanner() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // считывает ввод как в строчку, так и в столбик (через enter)

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scn.nextInt();
        }
        scn.close(); // don't forget to close Scanner and release resources

        double sum_x = 0;
        for (int i = 0; i < n; i++) {
            sum_x += x[i];
        }
        System.out.println(sum_x);
    }

    static void inputBufferedReader() {
        // try-with-resources releases resources automatically
        // https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(br.readLine());
            String b = br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    static void arrays() {
        int[] array; // declare array but don't initialize
        // init array with default value 0
        array = new int[10]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(array));
        array[1] = 123; // [0, 123, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(array));

        long[][] twoDimArray = new long[2][];
        twoDimArray[0] = new long[10];
        twoDimArray[1] = new long[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoDimArray)); // [[J@4617c264, [J@36baf30c]
    }
}
