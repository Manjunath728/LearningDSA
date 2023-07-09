public class BubbleSort {
    
    public static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }
    public static void main(String[] args) throws Exception {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            System.out.println(i+" itteration"); // to check how many time iterarted for loop
            // optimized code 
            int isSwaped=0;
            for(int j=0;j<n-1-i;j++){

                if(arr[j]>arr[j+1]){
                    
                    swap(arr,j,j+1);
                    isSwaped++;
                }
                
            }
            System.out.println(isSwaped+ " Swapped"); // check how many time swapped in that iteration
            if(isSwaped==0){ 
                break;
            }else{
                isSwaped=0;
            }
            
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
   
   
}
