public class LambdaExpression {
    public static void main(String[] args) {
         avengers obj = ()->  System.out.println("spiderman"); //so instead creating the methods directly we can give the  print statement here in the object.

        obj.show();

    }

    interface avengers{
        void show ();
    }



}
