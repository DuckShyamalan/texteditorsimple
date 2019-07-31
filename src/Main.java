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
            JMenu fileMenu = new JMenu("File");
            //Add menu items
            JMenuItem mi1 = new JMenuItem("New");
            JMenuItem mi2 = new JMenuItem("Open");
            JMenuItem mi3 = new JMenuItem("Save");
            JMenuItem mi4 = new JMenuItem("Print");
            //Add action listener
            mi1.addActionListener(this);
            mi2.addActionListener(this);
            mi3.addActionListener(this);
            mi4.addActionListener(this);
            //Add menu items to menu
            fileMenu.add(mi1); fileMenu.add(mi2); fileMenu.add(mi3); fileMenu.add(mi4);
            //Add menu to menubar
            menuBar.add(fileMenu);

            JMenu editMenu = new JMenu("Edit");
            //Add menu items
            JMenuItem mi5 = new JMenuItem("Cut");
            JMenuItem mi6 = new JMenuItem("Copy");
            JMenuItem mi7 = new JMenuItem("Paste");
            // Add action listener
            mi5.addActionListener(this);
            mi6.addActionListener(this);
            mi7.addActionListener(this);
            //Add menu items to menu
            editMenu.add(mi5);
            editMenu.add(mi6);
            editMenu.add(mi7);
            menuBar.add(editMenu);
            //JButton closeButton = new JButton("X");
            JMenuItem closeButton = new JMenuItem("Close");
            closeButton.addActionListener(this);
            menuBar.add(closeButton);

            frame.setJMenuBar(menuBar);
            frame.add(textArea);
            frame.setSize(500, 500);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }


    }
}