package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param input		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int array[]){
		int num , i;
		for(int j =1; j< array.length; j++){
			num = array[j];
			for(i = j - 1; (i >= 0) && (array[i] > num); i--){
				array[i + 1] = array[i];
			}
			array[i + 1] = num;
		}
		return array;
	}
}

