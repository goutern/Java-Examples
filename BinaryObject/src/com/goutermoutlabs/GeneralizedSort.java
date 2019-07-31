package com.goutermoutlabs;

public class GeneralizedSort {
    private static void swap(int i, int j,
                             Comparable[]
                                     a) {
        Comparable
                tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static int indexOfSmallest(
            Comparable[]
                    a, int start, int end
    ) {
        int index, indexSmallest;
        Comparable
                min = a[start];
        indexSmallest = start;
        for (index = start + 1; index < end
                ; index++) {
            if (
                    a[index].compareTo(min) < 0
            ) {
                min = a[index];
                indexSmallest = index;
            }
        }
        return indexSmallest;
    }

    public static void sort(
            Comparable[]
                    a, int size
    ) {
        int index, indexNextSmallest;
        for (index = 0; index < size
                ; index++) {
            indexNextSmallest =
                    indexOfSmallest
                            (a, index, size
                            );
            swap
                    (index, indexNextSmallest, a);
        }
    }
}