import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] candidates = { "Abhishek", "Lokesh", "Devendra", "Maaz" };
        int[] status = new int[candidates.length];
        int voter = 0;
        int choice, chooseCandidate = 0;
        lable: while (true) {
            System.out.println("1 : Vote Cast");
            System.out.println("2 : View candidate status");
            System.out.println("3 : Show all results");
            System.out.println("4 : Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1");
                    voter++;
                    System.out.println("Vote any candidate!");
                    for (int i = 0; i < candidates.length; i++) {
                        System.out.println(i + 1 + " -- " + candidates[i]);
                    }
                    chooseCandidate = sc.nextInt();
                    for (int temp = 0; temp < candidates.length; temp++) {
                        if (temp == chooseCandidate - 1) {
                            if (voter % 3 == 0 || voter % 7 == 0) {
                                status[2] += 1;
                            } else {
                                status[temp] += 1;
                            }
                            System.out.println("succefully vote submitted for " + candidates[temp]);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("2");
                    System.out.println("Candidate List");
                    int x = 0, input = 0;
                    while (x < candidates.length) {
                        System.out.println(x + 1 + " -- " + candidates[x]);
                        x++;
                    }
                    input = sc.nextInt();
                    System.out.println(candidates[input - 1] + " -- " + status[input - 1]);
                    break;
                case 3:
                    System.out.println("3");
                    for (int i = 0; i < candidates.length; i++) {
                        System.out.println(candidates[i] + " : " + status[i]);
                    }
                    break;
                case 4:
                    System.out.println("Thank you");
                    break lable;
            }
        }
    }
}
