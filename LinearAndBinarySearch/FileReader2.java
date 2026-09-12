package LinearAndBinarySearch;


import java.io.BufferedReader;
import java.io.IOException;

public class FileReader2 {

    public static void main(String[] args) {

        String targetWord = "Java";
        int count = 0;

        try {
            java.io.FileReader file = new java.io.FileReader("sample.txt");
            BufferedReader br = new BufferedReader(file);

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();
            file.close();

            System.out.println("The word '" + targetWord + "' appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

