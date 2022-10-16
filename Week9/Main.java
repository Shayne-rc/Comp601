package Week9;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        String txtfile = "week9/data.txt";
        try {
            GameApp app = new GameApp(txtfile);
            app.game();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}