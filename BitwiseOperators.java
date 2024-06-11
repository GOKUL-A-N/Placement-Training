public class BitwiseOperators {
    public static void main(String[] args) {
        // bitwise operator
        System.out.println(24 << 2); // left shift
        System.out.println(24 >> 2); // right shift
        System.out.println(24 & 12); // bitwise and
        System.out.println(24 | 12);// bitwise or
        System.out.println(!true); //not operator
        // increment and decrement
        int num = 32;
        System.out.println(++num + " " + num++ + " "+ num + " "+ ++num + " " + num++);
    }
}


// 33 33 34 35 35 in java

// 36 34 36 36 32 in c

// Bitwise for the following
// 15 -> 1111
// 25 -> 11001
// 31 -> 11111
// 14 -> 1110
// 28 -> 11100
// 34 -> 100010