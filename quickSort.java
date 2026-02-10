public class quickSort {

    static int partition(int[] arr,int low, int high){
        int p = arr[high];
        int i=low-1;
        int j = low;
        while (j< high) {
            if(arr[j] < p){
            i++;
            if(i != j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
            }else{
            j++;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = p;
        arr[high] = temp; 
        return i+1;
    }

    static void quicksort(int[] arr,int low, int high){
        if(low<high){
        int pivot = partition(arr,low,high);
        quicksort(arr, low, pivot-1);
        quicksort(arr, pivot+1,high);
        }
    }

     public static void main(String[] args) {
        int[] Array = {2,7,5,3,1};
        int low = 0;
        int high = Array.length-1;
       quicksort(Array,low,high);
       for(int i : Array){
        System.out.print(i+" ");
       }
    }
}
