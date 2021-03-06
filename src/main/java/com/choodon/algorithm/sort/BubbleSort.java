package com.choodon.algorithm.sort;

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
    public static void sort(int[] source) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        sort(source, 0, source.length - 1);
    }

    /**
     * @param source
     * @param low
     * @param high
     */
    public static void sort(int[] source, int low, int high) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        if (low < 0 || high > source.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (low >= high) {
            return;
        }
        for (int i = low; i <= high; i++) {
            for (int j = high; j > i; j--) {
                if (source[j] < source[j - 1]) {
                    int min = source[j];
                    source[j] = source[j - 1];
                    source[j - 1] = min;
                }
            }
        }
    }

}
