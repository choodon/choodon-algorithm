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

    public static void sort(int[] source, int low, int high) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        if (low >= high) {
            return;
        }
        int key = source[low];
        int lowKeyIndex = low;
        int highKeyIndex = high;
        for (int i = 1, num = high - low; i <= num; i++) {
            lowKeyIndex++;
            if (key > source[lowKeyIndex]) {
                int min = source[lowKeyIndex];
                source[lowKeyIndex] = key;
                source[lowKeyIndex - 1] = min;

            } else if (key < source[lowKeyIndex]) {
                for (; highKeyIndex >= lowKeyIndex; highKeyIndex--) {
                    if (source[highKeyIndex] < key) {
                        int min = source[highKeyIndex];
                        source[lowKeyIndex - 1] = min;
                        source[highKeyIndex] = source[lowKeyIndex];
                        source[lowKeyIndex] = key;
                        highKeyIndex--;
                        num--;
                        break;
                    } else if (source[highKeyIndex] == key) {
                        source[highKeyIndex] = source[lowKeyIndex];
                        source[lowKeyIndex] = key;
                        highKeyIndex--;
                        num--;
                        break;
                    }
                    num--;
                }
            }

        }
        sort(source, low, lowKeyIndex - 1);
        sort(source, lowKeyIndex, high);
    }
}
