public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {

    counter ob = new counter();
    Thread t1 = new Thread(new Runnable() {
        @Override
        public synchronized void run() {
           for(int i =1;i<=1000;i++) {
               ob.increment();
           }
        }
    });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                for(int i =1;i<=1000;i++) {
                    ob.increment();
                }
            }
        });
    t1.start();
    t2.start();
    t1.join();
    t2.join();

            System.out.println("count" + ob.count);

       }
      static class counter {
       int count;

       public void increment() {
           count++;
       }

   }

}


