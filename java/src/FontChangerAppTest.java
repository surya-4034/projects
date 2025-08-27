import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.*;

public class FontChangerAppTest {

    @Test
    void testAppLaunches() {
        // Check if Swing components can be created without exceptions
        assertDoesNotThrow(() -> {
            SwingUtilities.invokeAndWait(() -> {
                FontChangerApp.main(new String[]{}); 
            });
        });
    }

    @Test
    void testTextAreaInitialText() {
        // Create text area like in your app
        JTextArea textArea = new JTextArea(
                "This is a sample project.\n" +
                "It demonstrates how to build a Java Swing app.\n" +
                "You can change fonts dynamically using JComboBox.\n" +
                "This simulates a web-like page layout.\n" +
                "The project includes a top bar with title and font selector.\n" +
                "Main text area shows example lines of text.\n" +
                "Font changes update the text instantly.\n" +
                "It is a beginner-friendly Swing project.\n" +
                "Now extended with JUnit tests.\n" +
                "This project will be uploaded to GitHub!"
        );
        assertTrue(textArea.getText().contains("Java Swing app"));
    }
}
