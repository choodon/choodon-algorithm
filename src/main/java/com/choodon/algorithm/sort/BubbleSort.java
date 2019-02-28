package com.choodon.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * BubbleSort
 *
 * @author michael
 * @since 2019-02-28
 */
public class BubbleSort {
    private BubbleSort() {
    }

    /**
     * base version
     *
     * @param source
     * @return
     */
    public static int[] sort(int[] source) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        for (int i = 0, length = source.length; i < length; i++) {
            for (int j = source.length - 1; j > i; j--) {
                if (source[j] < source[j - 1]) {
                    int min = source[j];
                    source[j] = source[j - 1];
                    source[j - 1] = min;
                }
            }
        }
        return source;
    }

    public static void main(String[] args) {
        int[] source = new int[10];
        for (int i = 0, length = source.length; i < length; i++) {
            source[i] = new Random().nextInt(100000);
        }
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(sort(source)));
        System.out.println(Arrays.toString(SelectionSort.sort(source)).equals(Arrays.toString(sort(source))));
    }
}
