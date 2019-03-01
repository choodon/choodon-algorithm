package com.choodon.algorithm.sort;

/**
 * QuickSort
 *
 * @author michael
 * @since 2019-03-01
 */
public class QuickSort {
    private QuickSort() {
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
        int key = source[low];
        int keyIndex = low;
        int sortIndex = high;
        for (int i = 1, num = high - low; i <= num; i++) {
            keyIndex++;
            if (key > source[keyIndex]) {
                int min = source[keyIndex];
                source[keyIndex] = key;
                source[keyIndex - 1] = min;

            } else if (key < source[keyIndex]) {
                for (; sortIndex >= keyIndex; sortIndex--) {
                    if (source[sortIndex] < key) {
                        int min = source[sortIndex];
                        source[keyIndex - 1] = min;
                        source[sortIndex] = source[keyIndex];
                        source[keyIndex] = key;
                        sortIndex--;
                        num--;
                        break;
                    } else if (source[sortIndex] == key) {
                        source[sortIndex] = source[keyIndex];
                        source[keyIndex] = key;
                        sortIndex--;
                        num--;
                        break;
                    }
                    num--;
                }
            }

        }
        sort(source, low, keyIndex - 1);
        sort(source, keyIndex, high);
    }
}
