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
        int length = 1000;
        int[] source = new int[length];
        for (int i = 0; i < length; i++) {
            source[i] = new Random().nextInt(1010009);
        }
        int[] source1 = Arrays.copyOf(source, length);
        int[] source2 = Arrays.copyOf(source, length);
        int[] source3 = Arrays.copyOf(source, length);
        long now = System.currentTimeMillis();
        SelectionSort.sort(source1);
        long now1 = System.currentTimeMillis();
        BubbleSort.sort(source2);
        long now2 = System.currentTimeMillis();
        QuickSort.sort(source3, 0, source3.length - 1);
        long now3 = System.currentTimeMillis();
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(source1));
        System.out.println(Arrays.toString(source2));
        System.out.println(Arrays.toString(source3));
        System.out.println("SelectionSort: " + (now1 - now) + "ms");
        System.out.println("BubbleSort: " + (now2 - now1) + "ms");
        System.out.println("QuickSort: " + (now3 - now2) + "ms");
    }
}
