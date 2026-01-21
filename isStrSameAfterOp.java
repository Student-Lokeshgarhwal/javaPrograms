public class isStrSameAfterOp {

    public static void main(String[] args) {
        String s = "34789";
        int i = 0;
        int[] a = new int[s.length()];
        while (i < s.length()) {
            a[i] = Character.getNumericValue(s.charAt(i));
            i++;
        }
        int j = 0, temp = 0, k = 1;
        while (a.length - j != 2) {
            i = 0;
            while (i < a.length - k) {
                temp = (a[i] + a[i + 1]) % 10;
                a[i] = temp;
                i++;
            }
            k++;
            j++;
        }
        boolean res;
            if(a[0] == a[1]) {
                res = true;
            }else{
                res = false;
            }
        System.out.println(res);
    }
}