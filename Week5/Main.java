package Week5;

import static java.lang.System.out;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Note> notes = new LinkedList<>();
        notes.add(new Note("D", 19));
        notes.add(new Note("C", 20));
        notes.add(new Note("F", 31));
        notes.add(new Note("B", 45));
        notes.add(new Note("C", 73));
        notes.add(new Note("F", 13));
        notes.add(new Note("B", 34));
        notes.add(new Note("C", 53));
        processNotes(notes);
    }

    public static void processNotes(List<Note> notes) {
        int total = 0;
        for (int i = 0; i < notes.size(); i++) {
            notes.get(i).playNote();
            total += notes.get(i).getDuration();
        }
        out.printf("%s %d %s", "Total Duration:", total, "seconds");
    }
}