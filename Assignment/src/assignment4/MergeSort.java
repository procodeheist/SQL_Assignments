package assignment4;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {5,3,9,8,8,1};
		
		
		System.out.println(Arrays.toString(mergeSort(arr)));

	}
	public static int[] mergeSort(int[] arr) {
		
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length/2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		
		return merge(left,right);
	}
	private static int[] merge(int[] left, int[] right) {
		
		int l1=0;
		int r1=0;
		int[] res = new int[left.length+right.length];
		int resInd = 0;
		
		while(l1<left.length && r1<right.length) {
			if(left[l1]<right[r1]) {
				res[resInd] = left[l1];
				l1++;	
			}
			else {
				res[resInd] = right[r1];
				r1++;	
			}
			resInd++;
		}
		
		while(l1<left.length) {
			res[resInd] = left[l1];
			l1++;
			resInd++;
		}
		
		while(r1<right.length) {
			res[resInd] = right[r1];
			r1++;
			resInd++;
		}
		
		return res;
	}

}
