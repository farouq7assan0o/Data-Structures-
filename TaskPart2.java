import java.util.Arrays;

public class SortingComparison {

  // Selection Sort Implementation
  public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      // Swap the minimum element with the current element
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }

  // Merge Sort Implementation
  public static void mergeSort(int[] arr) {
    // Base case: If the array length is less than or equal to 1, return
    if (arr.length <= 1) {
      return;
    }
    int mid = arr.length / 2;
    // Create two subarrays by copying elements from the original array
    int[] left = Arrays.copyOfRange(arr, 0, mid);
    int[] right = Arrays.copyOfRange(arr, mid, arr.length);
    // Recursively call mergeSort on the left and right subarrays
    mergeSort(left);
    mergeSort(right);
    // Merge the sorted left and right sub arrays into the original array
    merge(left, right, arr);
  }

  // Merge two sorted arrays into one
  private static void merge(int[] left, int[] right, int[] arr) {
    int leftSize = left.length;
    int rightSize = right.length;
    int i = 0, j = 0, k = 0;
    // Compare elements from both subarrays and merge them into the original array
    while (i < leftSize && j < rightSize) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }
    // Copy the remaining elements from the left subarray, if any
    while (i < leftSize) {
      arr[k++] = left[i++];
    }
    // Copy the remaining elements from the right subarray, if any
    while (j < rightSize) {
      arr[k++] = right[j++];
    }
  }

  public static void main(String[] args) {
    int[] sizes = { 5000, 50000, 500000 };
    String[] algorithms = { "Selection Sort", "Merge Sort" };
    String[] orders = { "Sorted", "Reversely Sorted" };

    System.out.println("Algorithm / Order\t\t5000\t\t50000\t\t500000");

    for (String algorithm : algorithms) {
      for (String order : orders) {
        System.out.print(algorithm + " / " + order + "\t\t");
        for (int size : sizes) {
          // Generate an array of the specified size and order
          int[] arr = generateArray(size, order);
          long startTime = System.currentTimeMillis();
          if (algorithm.equals("Selection Sort")) {
            // Call the selectionSort method to sort the array
            selectionSort(arr);
          } else if (algorithm.equals("Merge Sort")) {
            // Call the mergeSort method to sort the array
            mergeSort(arr);
          }
          long endTime = System.currentTimeMillis();
          long elapsedTime = endTime - startTime;
          System.out.print(elapsedTime + "ms\t\t");
        }
        System.out.println();
      }
    }
  }

  // Generate an array of the specified size and order
  public static int[] generateArray(int size, String order) {
    int[] arr = new int[size];
    if (order.equals("Sorted")) {
      // Fill the array with values in ascending order
      for (int i = 0; i < size; i++) {
        arr[i] = i;
      }
    } else if (order.equals("Reversely Sorted")) {
      // Fill the array with values in descending order
      for (int i = 0; i < size; i++) {
        arr[i] = size - i;
      }
    }
    return arr;
  }
}