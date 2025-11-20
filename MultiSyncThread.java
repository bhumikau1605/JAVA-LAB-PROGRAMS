class SharedPrinter {
    synchronized void printMessage(String msg) {
        System.out.println(msg);
    }
}

class DisplayBMS extends Thread {
    SharedPrinter sp;

    DisplayBMS(SharedPrinter sp) {
        this.sp = sp;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                sp.printMessage("BMS College of Engineering");
                Thread.sleep(10000); // 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class DisplayCSE extends Thread {
    SharedPrinter sp;

    DisplayCSE(SharedPrinter sp) {
        this.sp = sp;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                sp.printMessage("CSE");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MultiSyncThread{
    public static void main(String[] args) {

        SharedPrinter sp = new SharedPrinter(); // shared synchronized printer

        DisplayBMS t1 = new DisplayBMS(sp);
        DisplayCSE t2 = new DisplayCSE(sp);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Both threads have finished. Main thread terminating...");
    }
}
