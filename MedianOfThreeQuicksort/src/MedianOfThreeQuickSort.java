package Project2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class MedianOfThreeQuickSort {

	// Use to if user wants to generate random array
	//private static int a[];

	// Use to compare medianOfSort with normal quicksort
	private static int a[] = { 22, 2, 35, 30, 66, 85, 2, 46, 89, 33, 12 };
	//private static int a[] = {5,4,3,2,1,11,5,7,3,8,5};
	// Already sorted array
	//private static int a[] = {1,2,3,4,5,6,7,8,9,10};
	private static int comp = 0;

	// Main method to run array through quick sort, prints to console and file (need
	// to un-indent writer to print to file)
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		MedianOfThreeQuickSort sorter = new MedianOfThreeQuickSort();
		// PrintStream writer = new PrintStream("medianOfThree_results.txt", "UTF-8");
		
		System.out.println("Array before quicksort: ");
		// writer.println("Array before quicksort: ");
		// printArray(writer);
		printArray(System.out);
		System.out.println("\n");
		System.out.println("Array after quicksort: ");
		// writer.println("\n");
		// writer.println("Array after quicksort: ");
		sorter.sort();
		// printArray(writer);
		printArray(System.out);
		System.out.println(" ");
		System.out.println("\n");
		System.out.print("Number of comparisons: " + comp);
		// writer.println(" ");
		// writer.println("\n");
		// writer.print("Number of comparisons: " + comp);
		// writer.close();
	}

	// Assumes j-i>=2 as per assignment instructions
	public void sort() {
		quickSort(0, a.length - 1);
	}

	// Partition by median of three and then quick sort
	private static void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int k = (lowerIndex + higherIndex) >>> 1;
		int pivot;
		// Sort a[i],a[j],a[k]
		if (a[k] < a[i]) {
			swap(i, k);
		}
		if (a[j] < a[i]) {
			swap(i, j);
		}
		if (a[j] < a[k]) {
			swap(j, k);
		}
		// Swap determined pivot point to last position and set this as pivot
		// Could swap pivot to any location, but last position seems to get best runtime
		//
		swap(k, j);
		pivot = a[j];

		// Partition array and count comparisons
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
				comp++;
			}
			while (a[j] > pivot) {
				j--;
				comp++;
			}
			if (i <= j) {
				swap(i, j);
				// move index to next position on left/right
				i++;
				j--;
			}
		}
		// call quickSort recursively
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);

	}

	// swap values in array between index i and j
	private static void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// Generate random array of size 10
	public static int[] getArray() {
		int size = 10;
		int[] array = new int[size];
		int item = 0;
		for (int i = 0; i < size; i++) {
			item = (int) (Math.random() * 100);
			array[i] = item;
		}
		return array;
	}

	// Print contents of array
	public static void printArray(PrintStream writer) {
		for (int i : a) {
			writer.print(i + " ");
		}
	}

}