import java.sql.SQLOutput;

public class ExceptionHandling {
    public static void main(String[] args) {

try
{
    int x[] = new int[4];
    x[2] = 2;

    int a = 4;
    int b = 2;
    int c = a / b;
    System.out.println("result" + c);
}

catch (ArithmeticException | ArrayIndexOutOfBoundsException E){
            System.err.println("error");
        }
catch (Exception ex){
    System.err.println("error");
}

finally {
    System.out.println("bye");
}




    }
}
