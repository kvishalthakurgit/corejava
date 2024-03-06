package ipa;

public class MergeSortExample {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(array);

        mergeSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    // Merge Sort function
    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n > 1) {
            int mid = n / 2;

            // Split the array into two halves
            int[] leftArray = new int[mid];
            int[] rightArray = new int[n - mid];

            System.arraycopy(array, 0, leftArray, 0, mid);
            System.arraycopy(array, mid, rightArray, 0, n - mid);

            // Recursively sort each half
            mergeSort(leftArray);
            mergeSort(rightArray);

            // Merge the sorted halves
            merge(array, leftArray, rightArray);
        }
    }

    // Merge function
    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }

    // Utility method to print an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

