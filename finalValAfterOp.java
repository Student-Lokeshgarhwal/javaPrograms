public class finalValAfterOp {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String str : operations){
            if(str.equals("++X")) ++x;
            else if(str.equals("X++")) x++;
            else if(str.equals("--X")) --x;
            else x--;
        }
        return x;
    }
    public static void main(String[] args) {
        String[] str = {"--X","X++","X++"};
        finalValueAfterOperations(str);
    }
}