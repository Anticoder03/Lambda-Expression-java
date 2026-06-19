package LamdaExpressionsDemo;

public class ThreadUsingLambda3 {

    public static void main(String[] args) {

        Thread tx;

        tx = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(
                    Thread.currentThread().getName() + " : " + i
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Alpha");

        tx.start();

        tx = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(
                    Thread.currentThread().getName() + " : " + i
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Bravo");

        tx.start();

        tx = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(
                    Thread.currentThread().getName() + " : " + i
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Charlie");

        tx.start();
    }
}