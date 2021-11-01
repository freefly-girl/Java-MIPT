package StringSamples;

import java.io.IOException;

public class Main extends Object {
    public static void main(String[] args) {
//        StringDemo();
//        Concatenation();
//        CompareStrings();
//        Transformations();
        SpeedTest();

    }

    static void StringDemo() {
        String phrase = "This" + " " + "is" + " " + "Java:)";
        System.out.println(phrase);
    }

    /**
     * Конкатенация
     */
    static void Concatenation() {
        Boolean bool = Boolean.TRUE;
        String result = "bool is " + bool;
        System.out.println(result); // bool is true

        DefinitelyNotString notString = new DefinitelyNotString();
        System.out.println("What is this? " + notString); // What is this? This is not a string
    }

    static void CompareStrings() {
        String a = "abs";
        String b = "abs";
        System.out.println("a == b " + (a == b)); // a == b true
        System.out.println("a equals b: " + a.equals(b)); // a equals b: true

        String a1 = new String("abs");
        String b1 = new String("abs");
        System.out.println("a1 == b1 " + (a1 == b1)); // a1 == b1 false
        System.out.println("a1 equals b1: " + a1.equals(b1)); // a1 equals b1: true
    }

    static void Transformations() {

        // String to Int
        int integer = Integer.parseInt("123");

        // int to string
        String string = Integer.toString(integer);
        System.out.println(integer + " " + string); // 123 123
    }

    static void SpeedTest() {
        long bufferResult = 0;
        long builderResult = 0;
        try {
            bufferResult = test(new StringBuffer());
            builderResult = test(new StringBuilder());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("StringBuffer: " + bufferResult + "ms.");
        System.out.println("StringBuilder: " + builderResult + "ms.");
        System.out.printf("StringBuilder is %f times faster.", (bufferResult + 0.0) / builderResult);

        /**
         * StringBuffer: 24283ms.
         * StringBuilder: 8057ms.
         * StringBuilder is 3,013901 times faster.
         */
    }

    static long test(Appendable obj) throws IOException {
        long start = System.currentTimeMillis();

        for (int i = 0; i++ < 1e9; ) {
            obj.append("");
        }
        long stop = System.currentTimeMillis();
        return stop - start;
    }
}
