import java.util.LinkedList;

public class NameQueue {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.addLast("Cynthia");
        names.addLast("Lorem");
        names.addLast("JhonDucket");
        for (String name : names) {
            System.out.println(names);
        }
        names.removeFirst();
        System.out.println(names.size());

    }    
}