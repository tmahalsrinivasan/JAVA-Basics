public class MultipleInheritance {
    public static void main(String[] args) {

        Deep obj = new babloo();
        obj.show();
        obj.output();

    }
    interface Deep{
        void show();
        public default void output(){
            System.out.println("method 1");
        }
    }
    interface Rams{

        public default void  output(){
            System.out.println("method 2");
        }
    }
    static class babloo implements  Deep, Rams{
        public void show(){
            System.out.println("method 3");
        }

        @Override
        public void output() {
            Deep.super.output();
        }

    }
}
