package homework4.junit.maps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class Maps {
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Philippines, Bangladesh, Spain, France");
        map.put(2, "Thailand, Taiwan, South Korea, China");
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            System.out.println("Thailand, Taiwan, South Korea, China");
            System.out.println("Philippines, Bangladesh, Spain, France");
        }
        for (Integer key: map.keySet()) {
            System.out.println(key);
        }
        map.keySet().iterator()
                .forEachRemaining(System.out::println);
        map.keySet().stream()
                .forEach(System.out::println);
        Stream.of(map.keySet().toArray())
                .forEach(System.out::println);
        System.out.println(map.keySet().toString());
        Stream.of(map.keySet().toString())
                .forEach(System.out::println);
    }

}

