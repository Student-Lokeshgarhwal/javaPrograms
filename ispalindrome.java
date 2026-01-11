public class ispalindrome {
    static String checkpalindrome(int n,String reversedNo){
        if(n == 0){
            return reversedNo;
        }
        reversedNo += n % 10;
        int remainingNo = n/10;
        String rev = checkpalindrome(remainingNo,reversedNo);
        return rev;
    }
    public static void main(String[] args) {
        int n = 1262;
        String finalReversed = "";
        String reversedNo = checkpalindrome(n,finalReversed);
        String strNo ="";
        strNo += n;
        System.out.println(strNo);
        System.out.println(reversedNo);
        if(strNo.equals(reversedNo)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}

