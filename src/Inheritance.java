
// ------------Inheritance concepts--------------

public class Inheritance {         //parent class or super class

    public int add(int a, int b){
        return a+b;
    }

public static class Inheritance1 extends Inheritance{        //child class or subclass
        public int sub(int a, int b){
            return a-b;
        }

        public static class  Inheritances extends Inheritance1{
            public int mul(int a, int b){
                return a*b;
            }
        }
    }
    public static void main(String[] args) {
      Inheritance1.Inheritances ob = new Inheritance1.Inheritances();
 int result = ob.add(2,1);
 int result1 = ob.sub(2,3);
 int result2 = ob.mul(2,2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);


   }

}
