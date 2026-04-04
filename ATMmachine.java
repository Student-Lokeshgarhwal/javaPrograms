import java.util.Scanner;

public class ATMmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumberOfNotes = 10;
        int fiveHundreds = NumberOfNotes;
        int twoHundreds = NumberOfNotes;
        int hundreds = NumberOfNotes;
        int fiftys = NumberOfNotes;

        int totalAmount = (500 * NumberOfNotes) + (200 * NumberOfNotes) + (100 * NumberOfNotes) + (50 * NumberOfNotes);

        int amount;
        int tempAmount;
        int payfiveHundredNotes;
        int paytwoHundredNotes;
        int payHundredNotes;
        int payfiftyNotes;
        int choice;
        while (true) {
            System.out.println("1 : Withdraw amount");
            System.out.println("2 : Exit");
            choice = sc.nextInt();
            if (choice == 1) {
                payfiveHundredNotes = 0;
                paytwoHundredNotes = 0;
                payHundredNotes = 0;
                payfiftyNotes = 0;
                System.out.println("Total amount : " + totalAmount);
                System.out.println("500 : " + fiveHundreds);
                System.out.println("200 : " + twoHundreds);
                System.out.println("100 : " + hundreds);
                System.out.println("50 : " + fiftys);
                System.out.println("Enter amount to withdrawal! ");
                amount = sc.nextInt();
                if (amount <= totalAmount) {
                    tempAmount = amount;
                    if (tempAmount >= 500) {
                        while (tempAmount >= 500 && fiveHundreds > 0) {
                            tempAmount -= 500;
                            fiveHundreds--;
                            totalAmount -= 500;
                            payfiveHundredNotes++;
                        }
                    }
                    if (tempAmount >= 200) {
                        while (tempAmount >= 200 && twoHundreds > 0) {
                            tempAmount -= 200;
                            twoHundreds--;
                            totalAmount -= 200;
                            paytwoHundredNotes++;
                        }
                    }
                    if (tempAmount >= 100) {
                        while (tempAmount >= 100 && hundreds > 0) {
                            tempAmount -= 100;
                            hundreds--;
                            totalAmount -= 100;
                            payHundredNotes++;
                        }
                    }
                    if (tempAmount >= 50) {
                        while (tempAmount >= 50 && fiftys > 0) {
                            tempAmount -= 50;
                            fiftys--;
                            totalAmount -= 50;
                            payfiftyNotes++;
                        }
                    }
                    System.out.println("Received notes! ");
                    System.out.println("500 : " + payfiveHundredNotes);
                    System.out.println("200 : " + paytwoHundredNotes);
                    System.out.println("100 : " + payHundredNotes);
                    System.out.println("50 : " + payfiftyNotes);
                } else {
                    System.out.println("Insufficient Balance");
                }
            } else if (choice == 2) {
                return;
            }else{
                System.out.println("Invalid Choice");
            }
        }
    }
}