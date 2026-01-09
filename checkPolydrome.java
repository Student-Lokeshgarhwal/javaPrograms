public class checkPolydrome {
    static String checkpoly(int n,String reversedNo){
        if(n == 0){
            return reversedNo;
        }
        reversedNo += n % 10;
        int remainingNo = n/10;
        String rev = checkpoly(remainingNo,reversedNo);
        return rev;
    }
    public static void main(String[] args) {
        int n = 1262;
        String finalReversed = "";
        String reversedNo = checkpoly(n,finalReversed);
        String strNo ="";
        strNo += n;
        System.out.println(strNo);
        System.out.println(reversedNo);
        if(strNo.equals(reversedNo)){
            System.out.println("polynomial");
        }else{
            System.out.println("Not polynomial");
        }
    }
}

