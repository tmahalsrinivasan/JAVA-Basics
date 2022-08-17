public class DefaultInterface {
    public static void main(String[] args) {

        tej obj = new b();

        obj.water();
        obj.liquid();



    }
    @FunctionalInterface
     interface tej{
        void liquid();
        default void water(){
            System.out.println("soda pop");
        }

     }
    static class a implements tej{

         @Override
         public void liquid() {
             System.out.println("show liquid");
         }

         @Override
         public void water() {
             System.out.println("show water");
         }

     }
     static class b extends a{
        public void water(){
            System.out.println("show  new water");
        }
     }


}
