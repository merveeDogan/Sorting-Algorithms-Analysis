import java.util.Arrays;
import java.util.Random;

public class SortingClass {

	private static void maxHeapify(int arr[], int low, int high, int i) {

		int left = 2 * i + 1 + low;
		int right = 2 * i + 2 + low;
		int largest = i + low;
		if (left <= high && arr[left] > arr[i + low])
			largest = left;
		else
			largest = i + low;
		if (right <= high && arr[right] > arr[largest])
			largest = right;

		if (largest != i + low) {
			exchange(arr, i+low, largest);
			maxHeapify(arr, low, high, largest - low);
		}
	}

	public static void heapSort(int arr[], int low, int high) {

		int n = high - low;

		for (int i = n / 2; i >= 0; i--) {
			maxHeapify(arr, low, high, i);
		}

		for (int i = n + low; i > low; i--) {

			int temp = arr[low];
			arr[low] = arr[i];
			arr[i] = temp;
			maxHeapify(arr, low, i - 1, 0);
		}
	}

	public static void heapSort(int arr[]) throws IllegalArgumentException {

		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException("Array is empty.");
		heapSort(arr, 0, arr.length - 1);
	}

//*******************************************************************************************************//
	public void shellSort(int[] Array) {
		for (int gap = Array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < Array.length; i += 1) {
				int temp = Array[i];
				int j;
				for (j = i; j >= gap && Array[j - gap] > temp; j -= gap) {
					Array[j] = Array[j - gap];
				}
				Array[j] = temp;
			}
		}
	}

//*******************************************************************************************************//
	static int partitionOnePivot(int[] Array, int low, int high) {

		int pivot = Array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (Array[j] <= pivot) {
				i++;
				exchange(Array, i, j);

			}
		}

		exchange(Array, i + 1, high);
		return i + 1;
	}

	public void introSort(int[] Array) {
		int maxdepth = (int) ((Math.log(Array.length) / Math.log(2)) * 2);
		sort(Array, 0, Array.length - 1, maxdepth);
	}

	private static void sort(int[] arr, int low, int high, int maxdepth) {

		int n = high - low;

		if (n <= 1)
			return;

		int pivot = partitionOnePivot(arr, low, high);

		if (maxdepth == 0)
			heapSort(arr, low, high);

		else {

		    sort(arr, low, pivot - 1, maxdepth - 1);
			sort(arr, pivot + 1, high, maxdepth - 1);

		}
	}

//*******************************************************************************************************//
	// Exchange two elements method for integer arrays
	private static void exchange(int[] Array, int firstIndex, int secondIndex) {
		int temp = Array[firstIndex];
		Array[firstIndex] = Array[secondIndex];
		Array[secondIndex] = temp;
	}

	// filling to array with equal numbers
	public int[] equalIntegersArray(int num, int size) {
		int equalNumbersArray[] = new int[size];
		Arrays.fill(equalNumbersArray, num);
		return equalNumbersArray;
	}

	// filling to array with random numbers
	public int[] RandomArray(int size) {
		int randomNumbersArray[] = new int[size];
		Random random = new Random();

		for (int i = 0; i < randomNumbersArray.length; i++) {
			randomNumbersArray[i] = random.nextInt(randomNumbersArray.length);
		}
		return randomNumbersArray;
	}

	// filling to array with increasing numbers
	public int[] IncreasingArray(int size, int start) {
		int value = start;
		int increasingNumbersArray[] = new int[size];

		for (int i = 0; i < increasingNumbersArray.length; i++) {
			increasingNumbersArray[i] = value;
			value += 1;
		}
		return increasingNumbersArray;
	}

	// filling to array with decreasing numbers
	public int[] DecreasingArray(int size, int start) {
		int value = start;
		int decreasingNumbersArray[] = new int[size];

		for (int i = 0; i < decreasingNumbersArray.length; i++) {
			decreasingNumbersArray[i] = value;
			value -= 1;
		}
		return decreasingNumbersArray;
	}
}