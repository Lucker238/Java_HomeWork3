import java.util.ArrayList;
import java.util.LinkedList;

public class Task11 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("1");
        array.add("2");
        array.add("3");
        LinkedList<String> link = new LinkedList<>();
        link.add("1");
        link.add("2");
        link.add("3");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            array.add(0, Integer.toString(i));
        }
        System.out.println(System.currentTimeMillis()-start); //1ms
        
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            link.add(0, Integer.toString(i));
        }
        System.out.println(System.currentTimeMillis()-start); //1ms

    }
}
