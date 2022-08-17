import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(2087);
        values.add(3085);
        values.add(2111);
        values.add(9001);


        Collections.sort(values,(i ,j ) -> i%10>j%10?1:-1);

        for(int o :values){
            System.out.println(o);
        }


    }
}
