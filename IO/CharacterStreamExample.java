package IO;

import java.io.*;

public class CharacterStreamExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("./input.txt");
            writer = new FileWriter("output.txt");
            int charData;
            while ((charData = reader.read()) != -1) {
                writer.write(charData);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
