import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        // loads a file from a resources folder
        InputStream is = new FileInputStream(new File("Border_Crossing_Entry_Data.csv"));

        // BufferedReader -> InputStreamReader -> InputStream

        // try-with-resources, auto close
        String line;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8));

        // read line by line
        int n = 0;
        ArrayList<Crossings> crossings = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            n = n + 1;
            if (n != 1) {
                Crossings c2 = new Crossings(line);
                crossings.add(c2);
                System.out.println(c2);
            }
        }
        System.out.println(crossings.size());
    }
}