package com.choodon.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * SortDemo
 *
 * @author michael
 * @since 2019-03-01
 */
public class SortDemo {
    public static void main(String[] args) {
        int length = 100000;
        int[] source = new int[length];
        for (int i = 0; i < length; i++) {
            source[i] = new Random().nextInt(100000);
        }
        int[] source1 = Arrays.copyOf(source, length);
        int[] source2 = Arrays.copyOf(source, length);
        int[] source3 = Arrays.copyOf(source, length);
        int[] source4 = Arrays.copyOf(source, length);
        int[] source5 = Arrays.copyOf(source, length);
        System.out.println(Arrays.toString(source));
        long now = System.currentTimeMillis();
        SelectionSort.sort(source1, 44, 999);
        long now1 = System.currentTimeMillis();
        SelectionSort.sort2(source2, 44, 999);
        long now2 = System.currentTimeMillis();
        BubbleSort.sort(source3, 44, 999);
        long now3 = System.currentTimeMillis();
        QuickSort.sort(source4, 44, 999);
        long now4 = System.currentTimeMillis();
        InsertionSort.sort(source5, 44, 999);
        long now5 = System.currentTimeMillis();
        String sortedSource1 = Arrays.toString(source1);
        String sortedSource2 = Arrays.toString(source2);
        String sortedSource3 = Arrays.toString(source3);
        String sortedSource4 = Arrays.toString(source4);
        String sortedSource5 = Arrays.toString(source5);
        System.out.println(sortedSource1);
//        System.out.println(sortedSource2);
//        System.out.println(sortedSource3);
//        System.out.println(sortedSource4);
//        System.out.println(sortedSource5);
        System.out.println(sortedSource1.equals(sortedSource2));
        System.out.println(sortedSource2.equals(sortedSource3));
        System.out.println(sortedSource3.equals(sortedSource4));
        System.out.println(sortedSource4.equals(sortedSource5));
        System.out.println("Selection Sort base version: " + (now1 - now) + "ms");
        System.out.println("Selection Sort upgrade version: " + (now2 - now1) + "ms");
        System.out.println("Bubble Sort: " + (now3 - now2) + "ms");
        System.out.println("Quick Sort: " + (now4 - now3) + "ms");
        System.out.println("Insertion Sort: " + (now5 - now4) + "ms");
    }
}
