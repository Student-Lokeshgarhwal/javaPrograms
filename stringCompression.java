public class stringCompression {
    public static int compress(char[] chars) {
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
            }
        }
        System.out.println(str);
        return str.length();
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int res = compress(arr);
        System.out.println(res);
    }

}
