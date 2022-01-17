package my.city;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class HashingTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("a");
        Map<StringBuilder, String> hsMap = new HashMap<>();
        hsMap.put(sb,"a");
        hsMap.put(sb,"b");
        hsMap.put(null,"c");
        hsMap.put(null,"d");

        Iterator iterator = hsMap.keySet().iterator();
        hsMap.entrySet().iterator();
        hsMap.entrySet();

        while ((iterator.hasNext()))
            System.out.println(hsMap.get(iterator.next()));
        System.out.println(hsMap.size());
    }
}
