public class divideValue {
     public static int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor == 1) return dividend;
        if(divisor == -1) return -dividend;
        
        int res=0;
        int sign=1;
        long n=(long)dividend, d=(long)divisor;
        if(n<0){
            sign = sign*(-1);
            n = (long)dividend*(-1);
            System.out.println(n);
        }
        if(d<0){
            sign = sign*(-1);
            d = (long)divisor*(-1);
        }
        while(n>=d){
            int p = 0;
            while(n >= d<<p) p++;
            p--;

            n -= d<<p;
            res += 1<<p;
        }
        if(sign==1 && res>=(Integer.MAX_VALUE-1)) return Integer.MAX_VALUE;
        else if(sign==-1 && res>=(Integer.MAX_VALUE)) return Integer.MIN_VALUE;
        
        return res*sign;
    }
    public static void main(String[] args) {
       int res = divide(354345, 123);
       System.out.println(res);
    }
}
