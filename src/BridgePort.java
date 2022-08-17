public class BridgePort {
    public static void main(String[] args) {

        clark obje1 = new clark();
       int result = obje1.addition(1, 2,3);
       int result1 = obje1.subtraction(1,7,5);
       int result2 = (int) obje1.division((int) 2.3f, (int) 4.5f);


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);



    }

    static class cook{
        public int addition(int a, int b, int c)
        {
             return a+b+c;
        }
    }
    static class harlem extends  cook{
        public  int subtraction(int a, int b , int c){
            return a-b-c;
        }
    }
    static class clark extends harlem{
        public float division(int a, int b){
            return a/b;
        }


    }
    static class kenosha extends clark{
        public int prod (int a, int b, int c, int d){
            return a*b*c*d;
        }
    }
}
