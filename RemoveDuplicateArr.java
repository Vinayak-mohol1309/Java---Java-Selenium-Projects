package com.advanto.pack2;

public class RemoveDuplicateArr {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,1,3,4,5};
		int arr2[]=new int[arr.length];
		//System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			int counter=arr[i];
			if(arr2[i] != arr[i]) {
				
				for(int j=0;i<arr2.length;j++) {
					if(arr2[j]!=counter) {
						arr2[i]=arr[i];
						counter=0;
						
					}else {
						break;
					}
				}
			}
		}
			for(int i=0;i<arr2.length;i++) {
				System.out.println(arr2[i]);
			}

	}

}
