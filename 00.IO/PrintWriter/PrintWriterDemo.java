import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pWriter = new PrintWriter(System.out, true);
        pWriter.println("This is written by PrintWriter");
        int i = -95;
        pWriter.println(i);
        double d = 854.35;
        pWriter.println(d);
    }    
}