package com.ds.sorting;

import java.util.Arrays;

public class MergeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 6, 3, 8, 5, 7, 1, 4, 0, 9, 3 };
		mergeSort(arr, 0, arr.length - 1);
		printArray(arr);
	}

	public static void mergeSort(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}
			int midIdx = (start + end) / 2;
			mergeSort(arr, start, midIdx);
			mergeSort(arr, midIdx+1, end);
			merge(arr, start, midIdx, end);		
	}

	public static void merge(int[] arr, int start, int mid, int end) {

		int[] tmpArray = new int[arr.length];
		int k = 0;
		int i = start;
		int j = mid+1;
		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				tmpArray[k] = arr[i];
				k++;
				i++;
			} else {
				tmpArray[k] = arr[j];
				k++;
				j++;
			}
		}

		while (i <= mid) {
			tmpArray[k++] = arr[i++];
		}

		while (j <= end) {
			tmpArray[k++] = arr[j++];
		}
		
		copyArray(tmpArray,arr);
	}
	
	public static void copyArray(int arr1[],int arr2[]){
		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}
	}
	public static void printArray(int arr[]){
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
	}
}
