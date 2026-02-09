public class heapSort {

    static void max_heapify(int[] arr,int i,int n){
        if((2*i)+1 < n){
            int large = i;
            if(arr[(2*i)+1] > arr[i]){
                large = (2*i)+1;
            }
            if((2*i)+2 < n){
                if(arr[(2*i)+2] > arr[large]){
                large = (2*i)+2;
            }
            }
            if(large != i){
                int temp = arr[large];
                arr[large] = arr[i];
                arr[i] = temp;
                max_heapify(arr, large, n);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,7,4,6};
        int n = arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            max_heapify(arr,i,n);
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = n-1;i>1;i--){
            int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                max_heapify(arr, 0, i-1);
                // System.out.print(arr[i]+" ");
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
