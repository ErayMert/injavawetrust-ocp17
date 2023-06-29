package chapter02.applying_unary_operators;

public class BitwiseComplementOperator {

    public static void main(String[] args) {

        int value = 3; // Stored as 0011
        int complement = ~value; // Stored as 1100
        System.out.println(value); // 3
        System.out.println(complement); // -4

        //3  -> 00000000 00000000 00000000 00000011
        //-4 -> 11111111 11111111 11111111 11111100
        // https://www.binaryconvert.com/convert_signed_int.html

        // To find the bitwise complement of a number, multiply it by negative one and then subtract one.
        System.out.println(-1 * value - 1); // -4
        System.out.println(-1 * complement - 1); // 3

    }
}
