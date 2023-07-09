public class InsertionSort {
    public static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) throws Exception {

        int[] arr = { 1,2,3,4,5,6,7,9,8};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 &&  (arr[j-1]>arr[j])) {
                swap(arr, j-1, j);
                j--;
            }

            
        }
        for (int ele : arr) {
            System.out.println(ele);
        }
    }

}
