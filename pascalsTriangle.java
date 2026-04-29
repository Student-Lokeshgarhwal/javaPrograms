import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        int listNum = 1;
        while(listNum < numRows){
            for(int i = 0;i<=listNum;i++){
                if(i == 0 || i == listNum){
                    list.get(listNum).add(1);
                    continue;
                }
                int n2 = list.get(listNum-1).get(i);
                int n1 = list.get(listNum-1).get(i-1);
                list.get(listNum).add(n1+n2);
            }
            listNum++;
        }
        return list;
    }
    public static void main(String[] args) {
        List<List<Integer>> res = generate(5);
        System.out.println(res);

    }
}