import java.util.*;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
       HashMap<String, Integer> new_map = new HashMap<String, Integer>();
       for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
           for (String l : entry.getValue()) {
               new_map.put(l.toLowerCase(), entry.getKey());
           }
       }
       return new_map;
   }
}
