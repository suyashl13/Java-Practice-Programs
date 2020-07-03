package Threads.CurrentThread;

public class MyThreads {
    public static void main(String [] args){
        Thread t = Thread.currentThread();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.print(i + " ");
                // i++;
                System.out.print("Current thread : " +t.getId() + "\n");
            }
    
        } catch (InterruptedException e) {
            System.out.println("Main thread Interupted");
        }
    }
}