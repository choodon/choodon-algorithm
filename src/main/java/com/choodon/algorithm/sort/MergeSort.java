package com.choodon.algorithm.sort;

/**
 * MergeSort
 *
 * @author michael
 * @since 2019-03-02
 */
public class MergeSort {
    private MergeSort() {
    }

    private static void merge(int[] source, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, index = 0;
        while (i <= mid || j <= high) {
            if (i <= mid) {
                if (j <= high) {
                    if (source[i] < source[j]) {
                        temp[index++] = source[i++];
                    } else {
                        temp[index++] = source[j++];
                    }
                } else {
                    temp[index++] = source[i++];
                }
            } else {
                if (i <= mid) {
                    if (source[i] < source[j]) {
                        temp[index++] = source[i++];
                    } else {
                        temp[index++] = source[j++];
                    }
                } else {
                    temp[index++] = source[j++];
                }
            }
        }
        System.arraycopy(temp, 0, source, low, temp.length);
    }

    public static void sort(int[] source, int low, int high) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        if (low < 0 || high > source.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(source, low, mid);
            sort(source, mid + 1, high);
            merge(source, low, mid, high);
        }
    }


    public static void sort(int[] source) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        sort(source, 0, source.length - 1);
    }

}
