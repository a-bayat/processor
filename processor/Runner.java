package processor;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Naven", 100);
        marks.put("Tom", 200);
        marks.put("Lisa", 300);
        marks.put("Peter", 400);
        marks.put("Robby", 600);

        marks.put(null, 500);
        System.out.println("there is nothing to mention");
    }
}
