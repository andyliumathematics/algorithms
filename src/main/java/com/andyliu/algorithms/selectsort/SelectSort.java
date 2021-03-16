package com.andyliu.algorithms.selectsort;

public class SelectSort {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 2345, 6, 43, 3, 3, 2345, 77, 957, 908, 354, 6 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int nowtop = 0; nowtop < arr.length - 1; nowtop++) {
            int minpos = nowtop;
            for (int i = minpos + 1; i < arr.length; i++) {
                if (arr[minpos] > arr[i])
                    minpos = i;
            }
            int tmp = arr[nowtop];
            arr[nowtop] = arr[minpos];
            arr[minpos] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
