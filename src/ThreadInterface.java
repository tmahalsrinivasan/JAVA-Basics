/*
1. THREAD INTERFACE
2. USED ANONYMOUS METHOD AND LAMBDA EXPRESSION
3. JOIN AND IS-ALIVE METHODS

 */


public class ThreadInterface {
    public static void main(String[] args) throws InterruptedException {
//here we have made the code more efficient by using the anonymous method and lambda expression. so the lines of the code are reduced.
        Thread T1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello"+ Thread.currentThread().getPriority() + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread T2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi" + Thread.currentThread().getPriority() + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        T1.setName("deepak");
        T2.setName("babloo");
        System.out.println(T1.getName());//thread names are printed
        System.out.println(T2.getName());
        T1.setPriority(3);
        T2.setPriority(4);
        System.out.println(T1.getPriority());//priorities are printed
        System.out.println(T2.getPriority());
        T1.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        T2.start();



        T1.join();//here we have used the join method which makes to run the print statement after completion of the thread executions
        T2.join();
        System.out.println(T1.isAlive());//is alive method is used here which gives false output and helps to check weather the thread is in running state or not.
        System.out.println("end here");
    }
    }


