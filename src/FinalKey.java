
//final can be used to the methods, variables and classes.
//if we use for the variables we can't change the values.
//if we use for the methods no one cane override the method
//if we used for the class no one can extend the class to the child class.
public class FinalKey {

    public static void main(String[] args) {

     final int   i = 5;
       // int i =10;

        a obj = new a();
        obj.method1();
    }

   static final class a {
        public final void method1(){
            System.out.println("method");
        }
    }

}
