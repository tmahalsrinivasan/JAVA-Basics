public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        a obj1 = new a();
        b obj2 = new b();
        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e){}
        obj2.start();



    }

   static class a extends Thread{
        public void run() {
            for(int i=1;i<=5;i++){
                System.out.println("hello");
                try {
                    Thread.sleep(2000,34);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

                }
    static  class b extends Thread{
        public void run() {
            for(int i=1;i<=5;i++){
                System.out.println("hi");
                try {
                    Thread.sleep(1000,30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
