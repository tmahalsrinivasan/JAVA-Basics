/*
COLLECTION & GENERICS
-->collection (concept)
-->Collection (Interface)
-->Collections (Class)
Definition: Collection provides you dynamic type of array where you can add expand and reduce the size of array.
1. we use iterator to fetch the values from the collection.
(-----latest------)2. we also use Enhance for loop to fetch the values






 */


import java.util.ArrayList;
import java.util.Collection;

public class CollectionGenerics {
    public static void main(String[] args) {

        Collection values = new ArrayList();
        values.add(1);
        values.add(2);
        values.add(4);
        values.add(3);
        System.out.println(values);

    }
}
