package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param input		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
public static int[] InsertSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
	     for(int j = i ; j > 0 ; j--){
		if(input[j] < input[j-1]){
                    temp = input[j];
		    input[j] = input[j-1];
                     input[j-1] = temp;			    
		}
	      }
         }

        return input;
    }
}
