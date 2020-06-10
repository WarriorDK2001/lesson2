import java.io.*;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(System.in);
        String word = r.next();
        StringBuilder result = new StringBuilder();
        File output = new File("textTwo.txt");
        File input = new File("textOne.txt");
        try {
            Scanner scanner = new Scanner(input);
            FileWriter writer = new FileWriter(output);
            BufferedWriter bufWriter = new BufferedWriter(writer);
            String line = scanner.nextLine();
            while (scanner.hasNextLine()) {
                if (line.contains(word)) {
                    result.append(line).append("\n");
                    System.out.println(line);
                }
                line = scanner.nextLine();
            }
            bufWriter.write(result.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}