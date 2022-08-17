public class MethodOverloading {


        public void a(int a, int b){
            System.out.println("this is the double integer statement");
            System.out.println("int:"+ a + "int:" + b);
        }
        public void a(int a, int b, int c){
            System.out.println("this is a triple statement");
            System.out.println("int:" + a + "int:" + b + "int" + c);
        }
        public void a(String text ){
            System.out.println("this is a fucking string statement asshole");
        }
        public void a (float num){
            System.out.println("this is a decimal statement");
            System.out.println("float" + num);
        }










    public static void main(String[] args) {

     MethodOverloading obj = new MethodOverloading();
        obj.a(1.6f);

    }
}
