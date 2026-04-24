public class meetTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        if(hours.length ==0) return 0;
        int emp = 0;
        for(int i=0;i<hours.length;i++){
            if(hours[i] >= target) emp++;
        }
        return emp;
    }
    public static void main(String[] args) {
        int[] num = {0,1,2,3,4};
        int target = 2;
        int number = numberOfEmployeesWhoMetTarget(num,target);
        System.out.print(number);
    }
}
