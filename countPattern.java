import java.util.Scanner;

public class countPattern {

    public static int countpattern(String string, String str1, String str2, int direction) {
        String newString = "";
        String newSubString = "";
        int count = 0;
        if (direction == 1){
            newString = str1 + str2;
        System.out.println(newString);}
        else{
            newString = str2 + str1;
        System.out.println(newString);}

        int n = newString.length();
        int i = 0;
        int j = n;
        while (j < string.length()) {
            if (string.charAt(i) == newString.charAt(0)) {
                newSubString = string.substring(i, j);
                if (newSubString.equals(newString))
                    count++;
            }
            i++;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String! ");
        String string = sc.next();
        System.out.println("Enter SubString! ");
        String subString = sc.next();
        System.out.println("Enter prefix or suffix of SubString! ");
        String prefixSubString = sc.next();
        int dir = 0;
        while (true) {
            System.out.println("Enter direction \n 1 : Forward! \n-1 : Backward!");
            dir = sc.nextInt();
            if (dir != 1 && dir != -1)
                System.out.println("Wrong direction entered");
            else
                break;
        }
        int counts = countpattern(string, subString, prefixSubString, dir);
        System.out.println(counts);
    }
}