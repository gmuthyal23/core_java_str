import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class unqStrWithJava {
    public static void str1(String str) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        String[] str2 = str.split("\\W");
        for (String st : str2) {
            if (map.containsKey(st)) {
                map.put(st, map.get(st));
            } else
                map.put(st, 2);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        String str56= "this is a new begining this is a new begining java java";
        str1(str56);
    }

}

