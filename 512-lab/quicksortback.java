import java.util.Arrays;

public class QuickSortBackward {

    public static void main(String[] args) {
        int[] unsortedArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        quickSortBackward(unsortedArray, 0, unsortedArray.length - 1);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void quickSortBackward(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partitionBackward(arr, left, right);
            quickSortBackward(arr, left, partitionIndex - 1);
            quickSortBackward(arr, partitionIndex + 1, right);
        }
    }

    public static int partitionBackward(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] >= pivot) {
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
