package Week1;
import static java.lang.System.out;

public class Main {
    
    public static void main(String[] args) {
    
        question1();
    }
    public static void question1() {
        String fmt = "%-20s %-20s\n"; // formatting to create 2 columns of text
        out.printf(fmt, "Escape Sequence", "Description");       
        out.println("-".repeat(35));
        out.printf(fmt, "\\n", "New Line character");
        out.printf(fmt, "\\t", "Horizontal Tab character");
        out.printf(fmt, "\\\"", "Double Quote character");
        out.printf(fmt, "\\b", "Backspace character");
    }   
}