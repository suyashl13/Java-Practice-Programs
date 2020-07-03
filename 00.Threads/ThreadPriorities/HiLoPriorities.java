class Clicker implements Runnable {
    int click = 0;
    Thread t;
    private volatile boolean running = true;

    public Clicker(int p){
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run(){
        while (running) {
            click ++;
        }
    }
    
    public void stop(){
        running = false;
    }
    public void start(){
        t.start();
    }
}

public class HiLoPriorities {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.MAX_PRIORITY);
        Clicker lo = new Clicker(Thread.MAX_PRIORITY);

        hi.start();
        lo.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        hi.stop();
        lo.stop();

        try {
            hi.t.join();
            lo.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Low-Priority Thread : " +lo.click);
        System.out.println("High-Priority Thread : " +hi.click);
        
    }
}