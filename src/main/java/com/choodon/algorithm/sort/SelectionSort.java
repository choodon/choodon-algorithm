package com.choodon.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * SelectionSort
 *
 * @author michael
 * @since 2019-02-28
 */
public class SelectionSort {
    private SelectionSort() {
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
        for (int i = 0, length = source.length; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (source[minIndex] > source[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int min = source[minIndex];
                source[minIndex] = source[i];
                source[i] = min;

            }

        }
        return source;
    }

    /**
     * upgrade version
     *
     * @param source
     * @return
     */
    public static int[] sort2(int[] source) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        for (int i = 0, length = source.length, j = length - 1; i < j; i++, j--) {
            int minIndex = i;
            int maxIndex = j;
            for (int m = i + 1, n = j - 1; m < j && n > i; m++, n--) {
                if (source[minIndex] > source[m]) {
                    minIndex = m;
                }
                if (source[maxIndex] < source[n]) {
                    maxIndex = n;
                }
            }
            if (minIndex != i) {
                int min = source[minIndex];
                source[minIndex] = source[i];
                source[i] = min;
            }
            if (maxIndex != j && source[maxIndex] > source[j]) {
                int max = source[maxIndex];
                source[maxIndex] = source[j];
                source[j] = max;
            }

        }
        return source;
    }

    public static void main(String[] args) {
        int[] source = new int[10002];
        for (int i = 0, length = source.length; i < length; i++) {
            source[i] = new Random().nextInt(100000);
        }
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(sort(source)));
        System.out.println(Arrays.toString(sort(source)).equals(Arrays.toString(sort2(source))));
    }
}
