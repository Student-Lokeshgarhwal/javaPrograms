public class countSort {
    public static void main(String[] args) {
        int[] A = {3,4,7,1,2,3,1,4,7,3,0};
        int large = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i] > large){
                large = A[i];
            }
        }
        int[] B = new int[large+1];
        for(int i=0;i<A.length;i++){
            B[A[i]] = B[A[i]]+1;
        }
        B[0] = B[0]+(-1);
        for(int i=1;i<B.length;i++){
            B[i] = B[i]+B[i-1];
        }
        int[] C = new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            C[B[A[i]]] = A[i];
            B[A[i]] = B[A[i]]-1;
        }
        for(int i: C){
            System.out.print(i+" ");
        }
    }
}
