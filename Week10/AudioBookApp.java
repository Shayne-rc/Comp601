package Week10;

import java.util.*;
import java.util.concurrent.*;
import java.io.IOException;
import java.nio.file.*;
import static java.lang.System.*;

public class AudioBookApp {
    private List<AudioBook> bookList;

    public List<AudioBook> getBookList() {
        return bookList;
    }

    public AudioBookApp(String filename) throws IOException {
        bookList = new LinkedList<>();
        readData(filename);
    }

    public void readData(String filename) throws IOException {
        bookList = new LinkedList<>();
        Path path = Paths.get(filename);
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] items = line.split(",");
            String name = items[0];
            int year = Integer.parseInt(items[1]);
            Double length = Double.parseDouble(items[2]);
            AudioBook b = new AudioBook(name, year, length);
            bookList.add(b); // everything is read correctly
        }
    }

    public AudioBook getShortestBook() {
        AudioBook shortest = bookList.get(0); // just initalising shortest value
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getLength() < shortest.getLength()) {
                shortest = bookList.get(i);
            }
        }
        return shortest;
    }

    public int countBooks() {
        int count = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getYear() <= 2020 && bookList.get(i).getYear() >= 2010) {
                count++;
            }
        }
        return count;
    }

    public void randomBookList() {
        LinkedList<AudioBook> b1 = new LinkedList<AudioBook>();
        LinkedList<AudioBook> b2 = new LinkedList<AudioBook>();
        LinkedList<AudioBook> b3 = new LinkedList<AudioBook>();

        for (int i = 0; i < bookList.size(); i++) {
            int num = ThreadLocalRandom.current().nextInt(1, 4);
            if (num == 1) {
                b1.add(bookList.get(i));
            } else if (num == 2) {
                b2.add(bookList.get(i));
            } else {
                b3.add(bookList.get(i));
            }
        }
        out.println("===== Books in List 1 =====");
        out.printf("%s %d\n", "Number of Books in List 1: ", b1.size());

        for (AudioBook i : b1) {
            i.displayInfo();
            out.println();
        }
        out.println("===== Books in List 2 =====");
        out.printf("%s %d\n", "Number of Books in List 2: ", b2.size());
        for (AudioBook i : b2) {
            i.displayInfo();
            out.println();
        }
        out.println("===== Books in List 3 =====");
        out.printf("%s %d\n", "Number of Books in List 3: ", b3.size());

        for (AudioBook i : b3) {
            i.displayInfo();
            out.println();
        }
    }
}