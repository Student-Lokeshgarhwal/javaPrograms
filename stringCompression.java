public class stringCompression {
    public static int compress(char[] chars) {
         if(chars.length== 1) return 1;
        int count = 1;
        int x = 0;
        String str = "";
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
                if (i + 1 == chars.length - 1) {
                    str = str + chars[i];
                    str += count;
                }
            } else {
                if (count > 1) {
                    str = str + chars[i];
                    str += count;
                } else {
                    str = str + chars[i];
                }
                count = 1;
                if(i+1 == chars.length - 1){
                    str = str + chars[i+1];
                }
            }
        }
        System.out.println(str);
        for(int i=0;i<chars.length;i++){
            if( i < str.length()){
            chars[i] = str.charAt(i);
            }else{
                chars[i] = ' ';
            }
        }
        for(int i=0;i<chars.length;i++){
            if(chars[i] == ' ') break;
            x +=1;
        }
        return x;
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int res = compress(arr);
        System.out.println(res);
    }

}
