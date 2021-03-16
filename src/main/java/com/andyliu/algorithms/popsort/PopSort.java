package com.andyliu.algorithms.popsort;

public class PopSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 2345, 6, 43, 3, 3, 2345, 77, 957, 908, 354, 6};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //冒泡排序
        for (int bottompos = arr.length - 1; bottompos > 0; bottompos--) {
            for (int i = 0; i < bottompos; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
