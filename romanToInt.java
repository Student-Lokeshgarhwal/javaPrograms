import java.util.HashMap;
import java.util.Map;

public class romanToInt {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int Intvalue = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'I') {
                if (i == s.length() - 1) {
                    Intvalue += map.get(s.charAt(i));
                } else if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                    Intvalue += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                    i++;
                } else {
                    Intvalue += map.get(s.charAt(i));
                }
            }
            else if(s.charAt(i) == 'V'){
                    Intvalue += map.get(s.charAt(i));
            }
            else if (s.charAt(i) == 'X') {
                if (i == s.length() - 1) {
                    Intvalue += map.get(s.charAt(i));
                } else if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                    Intvalue += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                    i++;
                } else {
                    Intvalue += map.get(s.charAt(i));
                }
            }
            else if(s.charAt(i) == 'L'){
                    Intvalue += map.get(s.charAt(i));
            }
            else if (s.charAt(i) == 'C') {
                if (i == s.length() - 1) {
                    Intvalue += map.get(s.charAt(i));
                } else if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                    Intvalue += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                    i++;
                } else {
                    Intvalue += map.get(s.charAt(i));
                }
            }
            else if(s.charAt(i) == 'D'){
                    Intvalue += map.get(s.charAt(i));
            }
            else if(s.charAt(i) == 'M'){
                    Intvalue += map.get(s.charAt(i));
            }
        }
        return Intvalue;
    }

    public static void main(String[] args) {
        int res = romanToInt("CMXCIX");
        System.out.println(res);
    }
}
