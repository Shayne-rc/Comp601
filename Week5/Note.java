package Week5;

import static java.lang.System.out;

public class Note {
    private String pitch;
    private int duration;

    public Note(String pitch, int duration) {
        this.setPitch(pitch);
        this.setDuration(duration);
    }

    public void playNote() {
        out.println("The note " + this.getPitch() + " is played for " + this.getDuration() + " seconds");
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}