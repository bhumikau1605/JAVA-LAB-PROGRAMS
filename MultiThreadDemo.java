class DisplayBMS extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class DisplayCSE extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("CSE");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        DisplayBMS t1 = new DisplayBMS();
        DisplayCSE t2 = new DisplayCSE();

        t1.start();
        t2.start();

        try {
            // Wait for both threads to complete before main thread ends
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Both threads have finished. Main thread terminating...");
    }
}
