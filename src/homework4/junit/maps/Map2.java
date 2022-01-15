package homework4.junit.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

    public class Maps2 {
        public static void main(String[] args)
        {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Miami, Boulder, Los Angeles");
            map.put(2, "Florida, Colorado, California");
            Iterator<String> itr = map.values().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
            for (String key: map.values()) {
                System.out.println(key);
            }
            map.values().iterator()
                    .forEachRemaining(System.out::println);
            map.values().stream()
                    .forEach(System.out::println);
            Stream.of(map.values().toArray())
                    .forEach(System.out::println);
            System.out.println(map.values().toString());
            Stream.of(map.values().toString())
                    .forEach(System.out::println);
        }
    }

