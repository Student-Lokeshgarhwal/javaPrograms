import java.util.Scanner;

class security {
    public static String encryption(int key, String str) {
        String cipherText = "";
        key = str.length() + key % 10;
        int updatedCh = 0;
        int i = 0;
        for (char ch : str.toCharArray()) {
            if ((int) ch >= 97) {
                updatedCh = (((ch - 'a') + key + i) % 26);
                cipherText += (char) (updatedCh + 'a');
            } else {
                updatedCh = (((ch - 'A') + key + i) % 26);
                cipherText += (char) (updatedCh + 'A');
            }
            i++;
        }
        return cipherText;
    }

    public static String decryption(int key, String str) {
        String normalText = "";
        key = str.length() + key % 10;
        int updatedCh;
        int j = 0;
        for (char ch : str.toCharArray()) {
            if ((int) ch >= 97) {
                updatedCh = (((ch - 'a') - key - j) + 26) % 26;
                normalText += (char) (updatedCh + 'a');
            } else {
                updatedCh = (((ch - 'A') - key - j) + 26) % 26;
                normalText += (char) (updatedCh + 'A');
            }
            j++;
        }
        return normalText;
    }
}

public class authenticity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String string = sc.next();
        System.out.println("Enter key");
        int key = sc.nextInt();
        boolean encrypted = false;
        String cipherText = "";
        String normalText = "";
        while (true) {
            System.out.println(
                    "Which operation do you want to perform! \n 1 -- encryption \n 2 -- decryption \n 3 -- skip and exit");
            int op = sc.nextInt();
            if (op == 1) {
                if (!encrypted) {
                    cipherText = security.encryption(key, string);
                    System.out.println(cipherText);
                    encrypted = true;
                } else
                    System.out.println("Already encrypted");
            } else if (op == 2) {
                if (encrypted) {
                    normalText = security.decryption(key, cipherText);
                    System.out.println(normalText);
                    encrypted = false;
                } else
                    System.out.println("This text is not encrypted");
            } else if (op == 3) {
                return;
            } else {
                System.out.println("Invalid number");
            }
        }
    }
}
