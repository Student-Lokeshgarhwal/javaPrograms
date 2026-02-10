

public class mergeSort {

    static void merge(int[] arr,int low,int mid,int high){
        int[] tempArr = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                tempArr[k] = arr[left];
                left++;k++;
            }else{
                tempArr[k] = arr[right];
                right++;k++;
            }
        }
        while (left<=mid) {
            tempArr[k] = arr[left];
            left++;k++;
        }
        while (right<=high) {
            tempArr[k] = arr[right];
            right++;k++;
        }
        int tempIdx = low;
        for(int i=0;i<k;i++){
            arr[tempIdx++] = tempArr[i];
        }
    }

    static void mergesort(int[] arr,int low,int high){
        if(low<high){
        int mid = (high+low)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1,high);
        merge(arr,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int[] Array = {2,5,1,3,7};
        int low = 0;
        int high = Array.length-1;
       mergesort(Array,low,high);
       for(int i : Array){
        System.out.print(i+" ");
       }
    }
}
