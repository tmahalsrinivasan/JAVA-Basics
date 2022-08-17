public class AnonymousClass {
    public static void main(String[] args) {
       String rose;
       String lily;
       String daisy;

       flowers obj = new a() {
           @Override
           public void show() {

               System.out.println("lily");
           }

           public void touch() {
               System.out.println("daisy");
           }
       };
       obj.display();
       obj.touch();
       obj.show();



    }

   interface  flowers{

        void display();
        void show();
         void touch();

    }

   static abstract class a implements flowers{

        @Override
        public void display() {
            System.out.println("rose");
        }
    }

    }




