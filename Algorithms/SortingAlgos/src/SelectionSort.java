public class SelectionSort {
    public static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }
    public static void main(String[] args) throws Exception {
      
    
        int[] arr={9,8,7,6,5,4,3,2,1,0};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){

                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }

        for (int i : arr) {
            System.out.println(i);
        }
    
    }
    
}
