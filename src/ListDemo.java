import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {


        List elements = new ArrayList();
        elements.add(2);
        elements.add(9);
        elements.add(7);
        elements.add(1,4);

        Iterator it = elements.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
