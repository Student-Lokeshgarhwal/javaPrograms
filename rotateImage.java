public class rotateImage {
    public void rotate(int[][] matrix) {
        int r = matrix[0].length;
        int c =r;
        int[][] res = new int[r][c];
        int len = r-1;
        int idx = 0;
        for(int C = 0;C<c;C++){
            idx = len;
            for(int R = 0;R<r;R++){
                res[C][idx--] = matrix[R][C];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                // System.out.print(res[i][j]);
                matrix[i][j] = res[i][j];
            }
            // System.out.println();
        }
    }
}