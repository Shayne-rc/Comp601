package Week9;
import java.util.*;
import java.io.IOException;
import java.nio.file.*;
import static java.lang.System.*;
import java.util.concurrent.*;
public class GameApp {
    static Scanner input = new Scanner(in);

    private List<Country> countryList;
    public GameApp(String filename) throws IOException {
        countryList = new LinkedList<>();
        readData(filename);
    }

    public void readData(String filename) throws IOException {
        countryList = new LinkedList<>();
        Path path = Paths.get(filename);
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] items = line.split(",");
            String name = items[0];
            String capital = items[1];
            int population = Integer.parseInt(items[2]);
            Country c = new Country(name, capital, population);
            countryList.add(c); // everything is read correctly
        }
    }

    public void game() {
        int randnum = ThreadLocalRandom.current().nextInt(0, countryList.size());
        String Answer = countryList.get(randnum).getCapital();
        String Capital = countryList.get(randnum).getName();
        out.printf("%s%s%s","What is the capital of ", Capital, "?");
        
        String guess = input.next();
        if (guess.equalsIgnoreCase(Answer)) {
            out.println("Correct!");
        }
        else {
            out.printf("%s %s \n","Incorrect, It's", Answer);
        }
        out.printf("%s %s %d %s",Capital, "is a country of", countryList.get(randnum).getPopulation(), "million.");

    }
}