public class MethodOverriding {
    public static void main(String[] args) {

        B OB = new B();
OB.show();


    }

    static public class A{

        public  void show()
        {
            System.out.println("NYC");
        }
    }
   static  public class B extends A{

        public  void show()

        {
            System.out.println("CHICAGO");
        }
    }
}
