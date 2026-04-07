import java.util.Scanner;

class employee {
    int emp_id;
    String name;
    float salary;

    employee(int emp_id, String name, float salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "emp_id :" + emp_id + " name :" + name + " salary :" + salary;
    }
}

public class employeeObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee[] employees = new employee[9999];
        int index = 0;
        int objectCount = 0;
        int choice;
        String name;
        int salary;
        int emp_id;
        while (true) {
            System.out.println("1 : create new object");
            System.out.println("2 : show all objects");
            System.out.println("3 : Exit");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    emp_id= (int) (Math.random()*10000);
                    for(int i=0;i<index;i++){
                        if(emp_id == employees[i].emp_id){
                            emp_id= (int)(Math.random()*10000);
                            System.out.println(emp_id+" " + employees[i].emp_id);
                            i = -1;
                        }
                    }
                    System.out.println("Enter employee name");
                    name = sc.next();
                    System.out.println("Enter employee salary");
                    salary = sc.nextInt();

                    employees[index++] = new employee(emp_id, name, salary);
                    objectCount++;
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Total Objects : "+objectCount);
                        for(int i=0;i<index;i++){
                        System.out.println(employees[i]);
                    }
                    System.out.println();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
