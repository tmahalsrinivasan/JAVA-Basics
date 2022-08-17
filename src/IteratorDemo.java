import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        Collection elements = new ArrayList();
        elements.add(1);
        elements.add(6);
        elements.add(2);
        // System.out.println(elements);

        Iterator it = elements.iterator();//this is used to fetch the data from the elements
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
