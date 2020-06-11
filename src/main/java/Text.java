import java.io.*;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws IOException {
        String word = "Hello";
        String type = "r";
        File input = new File("textOne.txt");
        try {
            Scanner scanner = new Scanner(input);;
            String line = scanner.nextLine();
            if (type.equals("r")) {
                while (scanner.hasNextLine()) {
                    if (line.contains(word)) {
                        System.out.println(line);
                    }
                    line = scanner.nextLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}