import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set <Integer> num = new HashSet<>();//in set it provides only unique data it doesnt provide the duplicate data.
        num.add(20);
        num.add(30);
        num.add(12);
        num.add(30);//this one does not print in output

        for(int i : num){
            System.out.println(i);
        }
    }
}
