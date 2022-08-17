public class SuperMethod {

    static class A {
        public A() {
            System.out.println("deepak");
        }
        public A( int a){
            System.out.println("mahal");
        }


        static class B extends A{
            public B(){

                System.out.println("tej");
            }
            public B (int a){
                super(a);
                System.out.println("ms");
            }
        }
    }


    public static void main(String[] args) {


        A.B ob = new A.B(5);


    }
}
