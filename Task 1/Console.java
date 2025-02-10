import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Console {
    public static String readLine() {
        String input = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {

            input = br.readLine();

        }
        catch (IOException ioe) {
            System.out.println("IO Error reading from command line.");
        }
        return input;
    }
}