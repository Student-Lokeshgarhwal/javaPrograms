import java.util.HashSet;
import java.util.Set;

public class restoreFinishOrder {
    public static int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int i :friends){
            set.add(i);
        }
        int index=0;
        for(int i : order){
            if(set.contains(i)){
                friends[index++] = i;
            }
        }
        return friends;
    }
    public static void main(String[] args) {
        int[] array1 = {3,2,5,4,7,9,1};
        int[] array2 = {5,6,3,9,7,1,2};
        int res[] = recoverOrder(array1, array2);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}