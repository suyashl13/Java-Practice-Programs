import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("Write anything and 'stop' to exit");
        try {
            do {
                line = bufferedReader.readLine();
                System.out.println(line);
            } while (!line.equals("stop"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}