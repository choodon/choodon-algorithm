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
        for (int i = low; i < high; i++) {
            int minIndex = i;
            for (int j = i + 1; j < high + 1; j++) {
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

    public static void sort2(int[] source, int low, int high) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        if (low < 0 || high > source.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (low >= high) {
            return;
        }
        for (int i = low, j = high; i < j; i++, j--) {
            int minIndex = i;
            int maxIndex = j;
            for (int m = i + 1, n = j - 1; m <= j && n >= i; m++, n--) {
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
                if (maxIndex == i) {
                    source[minIndex] = source[j];
                    source[j] = source[i];
                }
                source[i] = min;
            }
            if (maxIndex != j && maxIndex != i) {
                int max = source[maxIndex];
                source[maxIndex] = source[j];
                source[j] = max;
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
        sort2(source, 0, source.length - 1);
    }
}



