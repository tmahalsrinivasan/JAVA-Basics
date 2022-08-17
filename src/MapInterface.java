import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map <String,Integer> data = new HashMap<>();
        data.put("deepak",95);
        data.put("harsha",99);
        data.put("vishnu", 97);

        Set<String> keys = data.keySet();
        for(String s : keys){
            System.out.println( s + " " +data.get("s"));
        }



    }
}
