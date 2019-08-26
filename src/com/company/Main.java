package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(arr,0,len-1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sb.append(System.lineSeparator());
        }

        System.out.println(sb.toString());
    }

    public static void quicksort(int[] arr, int s, int e) {
        if(s >= e) return;
        int pivot = partition(arr, s, e);
        quicksort(arr, s, pivot -1);
        quicksort(arr, pivot + 1, e);
    }

    public static int partition(int arr[], int left, int right) {

        int pivot = arr[(left + right) / 2];

        while (left < right) {
            while ((arr[left] < pivot) && (left < right))
                left++;
            while ((arr[right] > pivot) && (left < right))
                right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        return left;
    }

}
