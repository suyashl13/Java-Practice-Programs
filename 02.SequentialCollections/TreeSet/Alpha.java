import java.util.TreeSet;

public class Alpha { 
        public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();
        names.add("Hello");
        names.add("World");
        names.add("e");
        names.add("Omg");
        System.out.println("Number of length : " + names.size());
        for (String name : names) {
            System.out.println("Name : " +name + " ");
        }
        System.out.println("Names after World " + names.lower("World"));        
    }
} 