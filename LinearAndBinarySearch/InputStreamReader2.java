import java.io.*;

public class InputStreamReader2 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        FileWriter fw = new FileWriter("output1.txt");

        String input;

        while (true) {
            System.out.print("Enter text: ");
            input = br.readLine();

            if (input.equals("exit")) {
                break;
            }

            fw.write(input);
            fw.write("\n");
        }

        fw.close();
        br.close();

        System.out.println("Data written to file successfully.");
    }
}