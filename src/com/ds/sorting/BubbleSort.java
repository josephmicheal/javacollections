package com.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {9,5,1,3,7,6,2};
		int n = arr.length;
		
		for(int i =0;i< n;i++){
			for(int j=0;j<(n-i-1);j++){
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
				printArray(i,j,arr);
			}
		}
	}
	
	public static void printArray(int i,int j,int arr[]){
		System.out.print(" i:"+i+" j:"+j+" : ");
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+":");
		}
		System.out.println();
	}

}
/*
i:0 j:0 : 5:9:1:3:7:6:2:
i:0 j:1 : 5:1:9:3:7:6:2:
i:0 j:2 : 5:1:3:9:7:6:2:
i:0 j:3 : 5:1:3:7:9:6:2:
i:0 j:4 : 5:1:3:7:6:9:2:
i:0 j:5 : 5:1:3:7:6:2:9:
i:1 j:0 : 1:5:3:7:6:2:9:
i:1 j:1 : 1:3:5:7:6:2:9:
i:1 j:2 : 1:3:5:7:6:2:9:
i:1 j:3 : 1:3:5:6:7:2:9:
i:1 j:4 : 1:3:5:6:2:7:9:
i:2 j:0 : 1:3:5:6:2:7:9:
i:2 j:1 : 1:3:5:6:2:7:9:
i:2 j:2 : 1:3:5:6:2:7:9:
i:2 j:3 : 1:3:5:2:6:7:9:
i:3 j:0 : 1:3:5:2:6:7:9:
i:3 j:1 : 1:3:5:2:6:7:9:
i:3 j:2 : 1:3:2:5:6:7:9:
i:4 j:0 : 1:3:2:5:6:7:9:
i:4 j:1 : 1:2:3:5:6:7:9:
i:5 j:0 : 1:2:3:5:6:7:9:
*/