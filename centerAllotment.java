import java.util.Scanner;

class candidate {

    String name;
    long phone_no;
    String DOB;
    String center;
    candidate(String name, long phone_no, String DOB,String center) {
        this.name = name;
        this.phone_no = phone_no;
        this.DOB = DOB;
        this.center = center;
    }
    candidate(String name, long phone_no, String DOB) {
        this.name = name;
        this.phone_no = phone_no;
        this.DOB = DOB;
        this.center = null;
    }

    public String toString() {
        return "candidate name : " + this.name + " candidate mobile number : " + this.phone_no + " candidate DOB : "
                + this.DOB +" alloted center : "+center;
    }

}

public class centerAllotment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] centers = new String[5];
        centers[0] = "Indore";
        centers[1] = "Bhopal";
        centers[2] = "Rewa";
        centers[3] = "Jabalpur";
        centers[4] = "Manpur";
        int[] seats = new int[5];
        for(int i=0;i<seats.length;i++){
            seats[i] = 2;
        }
        String name;
        long phone_no;
        String DOB;
        int choice;
        candidate[] candidatesData = new candidate[10];
        int[] selectedCenters = new int[5];
        int index = 0;
        int select;
        String gotCenter;
        int tempIndex;
        boolean getCenter = false;
        boolean centerChoiceAval = false;
        while (true) {
            System.out.println("1 : Profile Registration!");
            System.out.println("2 : Exit!");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter name!");
                name = sc.next();
                System.out.println("Enter mobile number!");
                phone_no = sc.nextLong();
                System.out.println("Enter DOB!");
                DOB = sc.next();
                System.out.println("Registration successfully! ");
                centerChoiceAval = true;
                inner : while (true) {
                    if(centerChoiceAval) System.out.println("1 : Choose Centers! ");
                    System.out.println("2 : View All Candidates! ");
                    System.out.println("3 : View All Centers! ");
                    System.out.println("4 : Exit! ");
                    select = sc.nextInt();
                    switch (select) {
                        case 1:
                            if(!centerChoiceAval) break;
                            System.out.println("Centers List! ");
                            for (int i=0;i<centers.length;i++) {
                                System.out.println((i+1)+" -- "+centers[i]);
                            }
                            System.out.println("Select Centers sequentially based on preferance");
                            for(int i = 0;i<centers.length;i++){
                                System.out.println("Select number of "+(i+1)+" center! ");
                                tempIndex = sc.nextInt();
                                selectedCenters[i] = tempIndex-1;
                            }
                            for(int i =0;i<selectedCenters.length;i++){
                                // String oneCandidate[i];
                                if(seats[selectedCenters[i]] > 0){
                                    seats[selectedCenters[i]] = seats[selectedCenters[i]]-1;
                                    gotCenter = centers[selectedCenters[i]];
                                candidatesData[index++] = new candidate(name, phone_no, DOB,gotCenter);
                                System.out.println("Center alloted! ");
                                getCenter = true;
                                    break;
                                }
                            }
                            if(!getCenter){
                                candidatesData[index++] = new candidate(name, phone_no, DOB);
                                 System.out.println("All seats are full in every selected centers!");}
                            centerChoiceAval = false;
                            break;
                        case 2:
                            for (candidate candidate : candidatesData) {
                                if (candidate == null) break;
                                System.out.println(candidate);
                            }
                            break;
                        case 3:
                            for (int i=0;i<centers.length;i++) {
                                System.out.println((i+1)+" -- "+centers[i]);
                            }
                            break;
                        case 4:
                            break inner;
                        default:
                            System.out.println("Invalid Choise! ");
                    }
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

    }
}
