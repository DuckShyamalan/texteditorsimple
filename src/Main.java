import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.new TextEditor();
    }

    class TextEditor extends JFrame implements ActionListener {

        JTextArea textArea;
        JFrame frame;

        public TextEditor() {
            frame = new JFrame("Text Editor v1.0.0");
            try {
                // Set cross-platform Java L&F (also called "Metal")
                UIManager.setLookAndFeel(
                        UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
                // handle exception
                e.printStackTrace();
            }
            textArea = new JTextArea();
            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu();
            menuBar.add(fileMenu);
            JMenu editMenu = new JMenu();
            menuBar.add(editMenu);
            JButton closeButton = new JButton("X");
            menuBar.add(closeButton);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }


    }
}