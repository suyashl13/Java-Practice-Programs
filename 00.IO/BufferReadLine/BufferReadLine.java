import java.io.*;
public class BufferReadLine {
    public static void main(String[] args) {
        String line;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                line = bfr.readLine();
                System.out.println(line);
            } while (!line.equals("stop"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}