package com.choodon.algorithm.recursion;

/**
 * recursion
 *
 * @author michael
 * @since 2019-03-02
 */
public class IsOrdered {
    private IsOrdered() {
    }

    /**
     * @param source
     * @param index
     * @param type   0:unknown 1:asc -1:desc
     * @return
     */
    public static boolean isOrdered(int[] source, int index, int type) {
        if (source == null) {
            throw new IllegalArgumentException("source is null");
        }
        if (source.length == 1 || source.length - 1 == index) {
            return true;
        }
        if (type == 0) {
            if (source[index] < source[index + 1]) {
                type = 1;
            } else if (source[index] > source[index + 1]) {
                type = -1;
            }
            return isOrdered(source, index, type);
        } else if (type == 1) {
            return (source[index] > source[index + 1]) ? false : isOrdered(source, index + 1, type);
        } else {
            return (source[index] < source[index + 1]) ? false : isOrdered(source, index + 1, type);
        }
    }

    /**
     * @param source
     * @param type   0:unknown 1:asc -1:desc
     * @return
     */
    public static boolean isOrdered(int[] source, int type) {
        return isOrdered(source, 0, type);
    }

    public static void main(String[] args) {
        int[] source1 = new int[]{1, 2, 3, 3, 4, 5, 6, 9, 10};
        System.out.println(isOrdered(source1, -1));
        System.out.println(isOrdered(source1, 0));
        System.out.println(isOrdered(source1, 1));
        int[] source2 = new int[]{9, 8, 7, 5, 4, 4, 2, 1, -11};
        System.out.println(isOrdered(source2, -1));
        System.out.println(isOrdered(source2, 0));
        System.out.println(isOrdered(source2, 1));
        int[] source3 = new int[]{9, 8, 7, 5, 22, 4, 4, 2, 1, -11};
        System.out.println(isOrdered(source3, -1));
        System.out.println(isOrdered(source3, 0));
        System.out.println(isOrdered(source3, 1));
    }
}
