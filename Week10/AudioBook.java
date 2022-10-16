package Week10;
import static java.lang.System.*;
public class AudioBook extends Book {
    private double length;

    public AudioBook(String name, int year, double length) {
        super(name, year);
        this.length = length;
    }

    public void displayInfo() {
     out.printf("%-15s %s\n", "Book Name", getName());
     out.printf("%-15s %d\n", "Publish Year", getYear());
     out.printf("%-15s %.2f\n", "Length (hours)", getLength());
     
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
