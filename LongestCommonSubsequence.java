public class LongestCommonSubsequence  {
        
    public static void print(String[][] arrow,int x,int y,String s1){
        if(x==0 || y ==0) return;
        if(arrow[x][y].equals("diag")){
            print(arrow, x-1, y-1,s1);
            System.out.print(s1.charAt(x-1));
        }else if(arrow[x][y].equals("up")){
            print(arrow, x-1, y,s1);
        }else{
            print(arrow, x, y-1,s1);
        }
    }
    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCABA";
        int x = s1.length();
        int y = s2.length();
        int[][] k = new int[x+1][y+1];
        String[][] arrow = new String[x+1][y+1];
        for(int i=0;i<=x;i++){
            k[i][0] = 0;
        }
        for(int j=1;j<=y;j++){
            k[0][j] = 0;
        }
        for(int i=1;i<=x;i++){
            for(int j = 1;j<=y;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    k[i][j] = k[i-1][j-1]+1;
                    arrow[i][j] = "diag";
                }
                else if(k[i-1][j] >= k[i][j-1]){
                    k[i][j] = k[i-1][j];
                    arrow[i][j] = "up";
                }
                else{
                     k[i][j] = k[i][j-1];
                    arrow[i][j] = "left";
                }
            }
        }
        System.out.println("count of total number of characters in LCS : "+k[x][y]);
        System.out.println("Longest common subsequence !");
        print(arrow, x, y,s1);
    }
}
