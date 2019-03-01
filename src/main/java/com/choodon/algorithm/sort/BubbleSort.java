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
        for (int i = 0, length = source.length; i < length; i++) {
            for (int j = source.length - 1; j > i; j--) {
                if (source[j] < source[j - 1]) {
                    int min = source[j];
                    source[j] = source[j - 1];
                    source[j - 1] = min;
                }
            }
        }
    }


}
