class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadName){
        this.name = threadName;
        t = new Thread(this, name);
        System.out.println("Thread Name : " +t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " +i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        System.out.println("Thread Exited");
    }
}

public class MultipleThreadsDemo {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        System.out.println("Exiting Main Thread");
    }
}