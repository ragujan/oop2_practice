package model_paper;

public class Q24 implements Runnable {

    public static void main(String[] args) {

        Thread parentThread;
        Q24 q = new Q24();
        parentThread = Thread.currentThread();
        System.out.println(parentThread.getName());
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    parentThread.wait();
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("bom bom " + i);
        }
    }

    public void run() {

    }

    public void run(Thread parentThread) {
        for (int i = 0; i < 10; i++) {
            try {
                parentThread.wait();
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
                run();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
