import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "src/simvol_file";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int maxLength = 0;
            int currentLength = 0;
            int currentCharacter;
            while ((currentCharacter = reader.read()) != -1) {
                char character = (char) currentCharacter;
                if (character == 'x') {
                    currentLength++;
                } else {
                    currentLength = 0;
                }
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
            System.out.println("Самая длинная последовательность символов x: " + maxLength);
        }
    }
}