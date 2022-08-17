import java.util.*;

public class ListType {
    public static void main(String[] args) {

        List <Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        Collections.sort(numbers);//ascending
        Collections.reverse(numbers);//descending
        Collections.shuffle(numbers);//shuffle the numbers

        Iterator it = numbers.iterator();
        for(int o:numbers){
            System.out.println(numbers);

        }
    }
}
