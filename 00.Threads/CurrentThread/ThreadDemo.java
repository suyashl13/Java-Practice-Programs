package Threads.CurrentThread;

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread();
        System.out.println("Child Thread : " +t);
        t.start();
    }
        
    @Override
    public void run() {
        try {
            for (int i = 5; i < 0; i--) {
                System.out.println("Child Thread" +i );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Exiting child thread");
    }

    
}

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
    }
}