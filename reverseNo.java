public class reverseNo{
     public static void main(String[] args) {

        int x = -124;
        int n=0;
        boolean flag = false;
        if(x<0){
            x = x+(x*-2);
            flag=true;
        }
        while (x>0) {
            n = n*10;
            n += x%10;
            x= x/10;
        }
        if(flag){
            n = n*-1;
        }
        System.out.println(n);

        
        // Integer n = 1234;
        // String str ="";
        // String s = n.toString(n);
        // for(int i=s.length()-1;i>=0;i--){
        //     // System.out.print(s.charAt(i));
        //     str = str+s.charAt(i);

        // }
        // System.out.println(str);
    }
}