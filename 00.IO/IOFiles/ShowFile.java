import java.io.*;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File no found");
            return;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Usage: Show file.");
            return;
        }
        do {
            i = fin.read();
            if (i != -1) {
                System.out.println((char)i);
            }
        } while (i != -1);
        fin.close();
    }
}