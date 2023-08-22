import java.util.Arrays;

public class QuickSortForward {

    public static void main(String[] args) {
        int[] unsortedArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        quickSortForward(unsortedArray, 0, unsortedArray.length - 1);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void quickSortForward(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partitionForward(arr, left, right);
            quickSortForward(arr, left, partitionIndex - 1);
            quickSortForward(arr, partitionIndex + 1, right);
        }
    }

    public static int partitionForward(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }
}
