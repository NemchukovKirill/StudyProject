package javaSimple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {
        int[] num = new int[4];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        try {
            num[3] = 4;
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();

        }
        System.out.println(num[1]);

        String[] str = {"2", "2", "4"};
        System.out.println(str[0]);

        ArrayList<String> list = new ArrayList<>();
        list.add("first213312");
        list.add("second");
        list.add("1");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println("forEach " + s.length());
        }
        list.forEach(s -> System.out.println("stream " + s));
        list.stream().filter(s -> s.length() < 4).forEach(s -> System.out.println("filtred = " + s));
        list.stream().filter(s -> s.contains("o")).forEach(s -> System.out.println("filtred = " + s));
        for (String b : list) {
            if (b.contains("i")) {
                ;
            }
            System.out.println("contains " + b);
        }
        ArrayList<String> secondlist = (ArrayList<String>) list.stream().filter(s -> s.length() < 3).collect(Collectors.toList());
        secondlist.forEach(s -> System.out.println("second list item = " + s));

        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value1");
        map.put("key3", "value1");
        map.put("key4", "value1");
        map.put("key1", "Привет как дела");
        System.out.println(map.get("key1"));

        Set<String> set;
        set = map.keySet();
        set.forEach(s -> System.out.println("keys "+ s));

        for (String s: set) {
            System.out.println("Значение ключа " + s + "=" + map.get(s));
        }
            for(Map.Entry<String,String> m : map.entrySet()){
                System.out.println("KEY = "+ m.getKey());
                System.out.println("VALUE = "+ m.getValue());
        }
    }
}