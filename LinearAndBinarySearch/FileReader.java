package LinearAndBinarySearch;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {

        java.io.FileReader fr = new java.io.FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}