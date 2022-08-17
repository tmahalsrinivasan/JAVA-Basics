public class WrapperDemo {


    public static void main(String[] args) {


        int i=45;
        Integer ii = new Integer(i);

        int j = ii.intValue();

        //-----------------------
        Integer j1 = ii;

        int k = j1;
        System.out.println(k);

        int a;
        int b;
        a1 obj = new a1();
       int result = obj.add(1,4);
        System.out.println(result);
//----------PARSE INT---------------------------------------------
         String str = "123";
         int n = Integer.parseInt(str);
        System.out.println(n);
    }
    //--------------------------------------------------
    static  class a1{

        public int add(int a, int b){
            return a+b;
        }
    }
}
