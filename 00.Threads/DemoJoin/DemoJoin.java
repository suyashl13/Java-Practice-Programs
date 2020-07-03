class NewThread{
    Thread t;
    String name;

    NewThread(String threadName){
        this.name = threadName;
        t = new Thread(name);
        System.out.println("New Thread : " + t);
        t.start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " +i);
                Thread.sleep(500);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Exited" +name);
    }

}

public class DemoJoin {
    public static void main(String[] args) {
        NewThread nThread1 = new NewThread("Thr1");
        NewThread nThread2 = new NewThread("Thr2");

        System.out.println("Hello Thread is alive state = " + nThread1.t.isAlive());
        try {
            System.out.println("Waiting for thread to finish.");
            nThread1.run();
            nThread1.t.join();
            nThread2.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}