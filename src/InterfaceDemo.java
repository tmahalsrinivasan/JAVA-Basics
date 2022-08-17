public class InterfaceDemo {
    public static void main(String[] args) {


        bigcats obj1 = new c();

        obj1.display();
    }

   interface  bigcats {
        void show();
        void display();
    }
     static  abstract class b implements bigcats {
        public void show (){
            System.out.println("TIGER");
        }
    }
    static class c extends b {

        @Override
        public void display() {
            System.out.println("LION");
        }
    }


    }

