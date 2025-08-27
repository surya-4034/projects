
import java.awt.*;
import javax.swing.*;

public class FontChangerApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FontChangerApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Frame
        JFrame frame = new JFrame("Font Changer Web-like Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);

        // Main panel with BorderLayout (for web page look)
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // ======= TOP BAR =======
        JPanel topBar = new JPanel(new BorderLayout());
        topBar.setBackground(new Color(230, 230, 250)); // Light lavender

        JLabel title = new JLabel("Font Changer on a Web-like Page");
        title.setFont(new Font("SansSerif", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 10));
        topBar.add(title, BorderLayout.WEST);

        // Font selector (top right)
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        JComboBox<String> fontBox = new JComboBox<>(fonts);
        fontBox.setSelectedItem("Serif");
        JPanel fontPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        fontPanel.setOpaque(false);
        fontPanel.add(new JLabel("Font: "));
        fontPanel.add(fontBox);
        topBar.add(fontPanel, BorderLayout.EAST);

        mainPanel.add(topBar, BorderLayout.NORTH);

        // ======= TEXT AREA =======
        JTextArea textArea = new JTextArea(
                "Welcome to the Font Changer App!\n\n"
                + "This project is a simple yet powerful desktop application built using Java Swing.\n"
                + "The main idea is to provide a web-page-like interface where users can customize text.\n"
                + "At the top-right corner, you will find a font selector dropdown.\n"
                + "By choosing a font, the style of the text in this area will change instantly.\n\n"
                + "The project demonstrates how to:\n"
                + "  • Use JFrame and JPanel for layout design.\n"
                + "  • Implement JTextArea for multi-line text editing.\n"
                + "  • Add JComboBox for interactive font selection.\n"
                + "  • Apply ActionListeners to respond to user input.\n\n"
                + "This project is part of a learning exercise to understand Swing components,\n"
                + "event-driven programming, and GUI-based application design in Java."
        );
        textArea.setFont(new Font("Serif", Font.PLAIN, 18));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JScrollPane scrollPane = new JScrollPane(textArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Font change action
        fontBox.addActionListener(e -> {
            String selectedFont = (String) fontBox.getSelectedItem();
            textArea.setFont(new Font(selectedFont, Font.PLAIN, 18));
        });

        // Add to frame
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
    }
}
