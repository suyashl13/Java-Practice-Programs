import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack names = new Stack();
        names.push("Suyash");
        names.push("R");
        names.push("heya");
        System.out.println(names.peek());
        if (!names.isEmpty()) {
            names.pop();
        }   
        System.out.println(names.peek());
    }
}
