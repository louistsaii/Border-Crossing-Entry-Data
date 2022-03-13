import java.io.*;
import java.nio.charset.StandardCharsets;

public class Practice_0306 {

    public static void main(String[] args) throws IOException {

        // loads a file from a resources folder
        InputStream is = new FileInputStream(new File("Border_Crossing_Entry_Data.csv"));

        // BufferedReader -> InputStreamReader -> InputStream

        // try-with-resources, auto close
        String line;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8))) {

            // read line by line
            int n = 0;
            while ((line = br.readLine()) != null) {
                n = n + 1;
                System.out.println(line);
                String[] arrOfStr = line.split(",");

                for(String a : arrOfStr){
                    System.out.println("     " + a);
                }
                if(n>10){
                    break;
                }
            }

        }

    }
}