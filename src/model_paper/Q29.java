package model_paper;

import java.util.Map;

public class Q29 {
    public static void main(String[] args) {
        Thread t = new Thread(Q29::run);
        GroupOfThreads got = new GroupOfThreads();
        got.executeThreads();
        t.setName("T1");
        t.setPriority(8);
        t.start();
        System.out.println(t);

        ThreadGroup group = new ThreadGroup("MyGroup");
        Thread t2 = new Thread(group, () -> {
            // some task
        });
        t2.setName("T1");
        System.out.println(t2);

    }

    public static void run() {
        for (int i = 0; i < 10; i++) {
//            try {
////                System.out.println("bro");
////                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

class GroupOfThreads implements Runnable {
    public void executeThreads() {
        GroupOfThreads got = new GroupOfThreads();
        Thread one = new Thread(got);
        Thread two = new Thread(got);
        Thread three = new Thread(got);
        Thread four = new Thread(got);
        Thread five = new Thread(got);
        System.out.println(one + " " + two + " " + three + " " + four + " " + five);
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();

    }

    public void run() {
        System.out.println("HEY " + Thread.currentThread());
    }
}
