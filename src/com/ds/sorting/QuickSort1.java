package com.ds.sorting;

import java.util.Arrays;

public class QuickSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 8, 5, 7, 4, 5, 6, 3, 1 };
		quickSort(arr,0,arr.length-1);
		Arrays.stream(arr).forEach(System.out::print);
	}
	
	public static void quickSort(int arr[],int start,int end){
		if(start<end){
			int pivotIndx = partition(arr,start,end);
			quickSort(arr,start,pivotIndx-1);
			quickSort(arr,pivotIndx+1,end);
		}
	}

	public static int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (arr[j] <= pivot) {
				i = i + 1;
				if(arr[i] != arr[j]){
				exchange(arr, i, j);
				}
			}
		}
		exchange(arr, i + 1, end);
		return i + 1;
	}

	public static void exchange(int arr[], int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

}
