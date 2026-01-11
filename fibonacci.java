public class fibonacci {
    public static void main(String[] args) {
        int n = 7;
    int value1 = 0;
    int value2 = 1;
    int sum =0;
    for(int i=0;i<n;i++){
        System.out.print(value1+" ");
        sum = value1+value2;
        value1=value2;
        value2=sum;
    }
    }
}
