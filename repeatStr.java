import java.util.Scanner;

public class repeatStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String! ");
        String str = sc.nextLine();
        String substr = "";
        int i = 0;
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                substr = str.substring(i, j);
            }
            if(j == str.length()-1 && substr == ""){ 
                substr = str;
                break;
            }
            if (substr != "") {
                int x = 0;
                int repeat = 0;
                for (; j < str.length(); j++) {
                    if (str.charAt(j) == substr.charAt(x)) {
                        if (x == substr.length() - 1){
                            x = 0;
                            repeat++;
                        }
                        else{
                            x++;
                        }
                        if(j == str.length()-1 && x != 0){
                            if(repeat == 0) substr = str;
                            else substr = "-";
                            break;
                    }
                    } else {
                        for (; j < str.length(); j++) {
                            if(j == str.length()-1) {
                                substr = "-";
                                break;
                            }
                            if (str.charAt(i) == str.charAt(j)) {
                                substr = str.substring(i, j);
                                break;
                            }
                        }
                    }
                }
                System.out.println(substr);
                System.out.println(repeat);
                break;
            }
        }
        System.out.println(substr);
    }
}
