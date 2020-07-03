import java.util.HashMap;

public class Grades {
    public static void main(String[] args) {
        HashMap<String,Integer> grades = new HashMap<String,Integer>();
        grades.put("Suyash", 65);
        grades.put("Someone", 54);
        grades.put("Lorem", 65);
        grades.put("Ipsum", 98);
        System.out.println("Lorems Grade : " +grades.get("Lorem")); // .get('key');
        System.out.println("Size of Grade : " +grades.size()); // .size(); returns size
        if (!grades.containsKey("Smith")) {
            System.out.println("Hey there is no Smith");
        }
    }
}