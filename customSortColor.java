public class customSortColor {
    public static String customSortString(String order, String s) {
        int[] arr = new int[26];
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            idx = s.charAt(i)-97;
            arr[idx] += 1; 
        }
        for(int i = 0;i<order.length();i++){
            idx = order.charAt(i)-97;
            if(arr[idx] > 0){
                while(arr[idx] > 0){
                    sb.append(order.charAt(i));
                    arr[idx] -= 1;
                }
            }
        }
        char ch;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                ch = (char) (i+97);
                while(arr[i] > 0){
                    sb.append(ch);
                    arr[i] -= 1;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = customSortString("cba", "abcd");
        System.out.println(str);
    }
}