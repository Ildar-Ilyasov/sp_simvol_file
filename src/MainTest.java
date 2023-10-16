import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMaxLength() throws IOException {
        String simulatedFileContent = "12345678";
        StringReader stringReader = new StringReader(simulatedFileContent);
        BufferedReader reader = new BufferedReader(stringReader);

        int maxLength = Main.findLongestSequence(reader, 'x');

        assertEquals(0, maxLength);
    }

    @Test
    public void testNoCharacter() throws IOException {
        String simulatedFileContent = "abcde";
        StringReader stringReader = new StringReader(simulatedFileContent);
        BufferedReader reader = new BufferedReader(stringReader);

        int maxLength = Main.findLongestSequence(reader, 'x');

        assertEquals(0, maxLength);
    }

    @Test
    public void testEmptyFile() throws IOException {
        String simulatedFileContent = "";
        StringReader stringReader = new StringReader(simulatedFileContent);
        BufferedReader reader = new BufferedReader(stringReader);

        int maxLength = Main.findLongestSequence(reader, 'x');

        assertEquals(0, maxLength);
    }
}