import java.util.ArrayList;
import java.util.List;

public class plusOne {

    public static int[] addOne(int[] digits){
            List<Integer> result = new ArrayList<>();
        if(digits[digits.length-1] == 9){
           int temp=0,carry=1;
           for(int i=digits.length-1;i>=0;i--){
            if(carry == 1){
            temp = digits[i];
            temp += 1;
                result.add(0,temp%10);
            carry = temp/10;
            }else{
                result.add(0,digits[i]);
            }
           }if(carry == 1){
            result.add(0, temp/10);
           }
        }
        else{
            for(int i=0;i<digits.length;i++){
                if(i == digits.length-1 ) {
                    result.add(digits[i]+1);
                }else{
                    result.add(digits[i]);
                }
            }
        }
        int[] resultArray = new int[result.size()];
        for(int i=0;i<result.size();i++){
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] a ={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,9,9,9};
        int[] res = addOne(a);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
