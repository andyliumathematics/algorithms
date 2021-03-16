package com.andyliu.algorithms.popsort;

public class PopSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 2345, 6, 43, 3, 3, 2345, 77, 957, 908, 354, 6};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //冒泡排序
        for (int bottompos = arr.length; bottompos >= 0; bottompos--) {
            int minpos = bottompos;
            for (int i = minpos + 1; i < arr.length; i++) {
                if (arr[minpos] > arr[i])
                    minpos = i;
            }
            int tmp = arr[bottompos];
            arr[bottompos] = arr[minpos];
            arr[minpos] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
