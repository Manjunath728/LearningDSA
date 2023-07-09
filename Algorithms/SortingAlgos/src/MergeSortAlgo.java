import java.util.ArrayList;

public class MergeSortAlgo {
    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }

    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int leftI = low;
        int rightI = mid + 1;
        while (leftI <= mid && rightI <= high) {
            if (arr[leftI] <= arr[rightI]) {
                temp.add(arr[leftI]);
                leftI++;
            } else {
                temp.add(arr[rightI]);
                rightI++;
            }
        }
        while (leftI <= mid) {
            temp.add(arr[leftI]);
            leftI++;
        }
        while (rightI <= high) {
            temp.add(arr[rightI]);
            rightI++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 8 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
