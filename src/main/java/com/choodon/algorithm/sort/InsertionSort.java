package com.choodon.algorithm.sort;

/**
 * InsertionSort
 *
 * @author michael
 * @since 2019-03-01
 */
public class InsertionSort {
    private InsertionSort() {
    }

    public static void sort(int[] source) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        sort(source, 0, source.length - 1);
    }

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
        for (int i = low + 1; i < high + 1; i++) {
            int insert = source[i];
            int insertIndex = i;
            for (int j = i - 1; j >= low; j--) {
                if (insert < source[j]) {
                    source[j + 1] = source[j];
                    insertIndex = j;
                } else if (source[j] < insert) {
                    break;
                }
            }
            source[insertIndex] = insert;
        }
    }
}
