public class trafficSignalColor {
    public static String trafficSignal(int timer) {
        if(timer == 0) return "Green";
        else if(timer == 30) return "Orange";
        else if(timer >30 && timer <=90) return "Red";
        else return "Invalid";
    }
    public static void main(String[] args) {
        int timer = 60;
        String res = trafficSignal(timer);
        System.out.println(res);
    }
}