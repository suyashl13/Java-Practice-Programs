import java.util.PriorityQueue;

public class Line {
    public static void main(String[] args) {
        PriorityQueue<String> line = new PriorityQueue<String>();
        line.add("Suyash");
        line.add("Swati");
        line.add("Samruddhi");
        line.add("lawand");
        line.add("Keshav");
        for (String ln : line) {
            System.out.println(ln);
        }
        System.out.println("------------------------------");
        // line.poll();
        for (String ln : line) {
            System.out.println(ln);
        }
        line.remove("Suyash");
        System.out.println("------------------------------");
        for (String ln : line) {
            System.out.println(ln);
        }
    }
}