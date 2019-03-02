package com.choodon.algorithm.backtracking;

/**
 * Binary
 *
 * @author michael
 * @since 2019-03-03
 */
public class BinaryGenerator {
    private BinaryGenerator() {
    }

    private static void generateBinary(int[] source, int n) {
        if (n == source.length - 1) {
            StringBuilder stringBuilder = new StringBuilder(source.length);
            for (int i : source) {
                stringBuilder.append(i);
            }
            System.out.println(stringBuilder);
        } else {
            source[n + 1] = 0;
            generateBinary(source, n + 1);
            source[n + 1] = 1;
            generateBinary(source, n + 1);
        }

    }

    public static void generateBinary(int[] source) {
        generateBinary(source, -1);
    }

    public static void main(String[] args) {
        int[] source = new int[2];
        generateBinary(source);
    }
}
