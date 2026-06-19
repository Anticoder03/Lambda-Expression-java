package LamdaExpressionsDemo;



public class ThreadUsingLambda2 {

    public static void main(String[] args) {

        Runnable r1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };

        Runnable r2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("\t" + Thread.currentThread().getName() + " : " + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };

        Runnable r3 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("\t\t" + Thread.currentThread().getName() + " : " + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };

        Thread tx1 = new Thread(r1, "Thread-1");
        Thread tx2 = new Thread(r2, "Thread-2");
        Thread tx3 = new Thread(r3, "Thread-3");

        tx1.start();
        tx2.start();
        tx3.start();
    }
}
