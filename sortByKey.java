import java.util.*;

public class sortByKey {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        // Sort by Key
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println(sortedMap);
    }
}
