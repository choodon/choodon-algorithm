package com.choodon.algorithm.sort;

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
    public static void sort(int[] source) {
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
    }

    /**
     * upgrade version
     *
     * @param source
     * @return
     */
    public static void sort2(int[] source) {
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
    }

}
