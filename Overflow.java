import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Overflow {
    public static void main(String[] args) throws IOException {
        int a = Integer.MAX_VALUE;
        int b = 1;
        int c = a + b; // This will cause an overflow

        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (Exception ex) {
            throw new IOException("dcm!");
        }
        System.out.println("Overflow result: " + c);
    }
}
