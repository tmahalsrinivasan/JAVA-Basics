import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your full name");
        String name = sc.next();
        name += sc.nextLine();
        System.out.println(name);


        System.out.println("what is your date of birth");
        int dob =sc.nextInt();
        System.out.println(dob);
        System.out.println("where do you live ?");
        String place = sc.next();
        place += sc.nextLine();
        System.out.println(place);
        System.out.println("which school");
        String univ = sc.next();
        univ += sc.nextLine();
        System.out.println(univ);

        System.out.println("thanks for the info");
    }
}
