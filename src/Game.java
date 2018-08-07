import javafx.css.Rule;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.*;

// The frame and menu for the game
public class Game extends JFrame {
    // create board
    board board;

    // Create Menu
    private JMenuBar menu = new JMenuBar();

    // Menu buttons
    private JMenu Difficutly = new JMenu("Difficulty");
    private JMenu Options = new JMenu("Options");

    // Create Sub-Menu for Options
    private JMenuItem Rules = new JMenuItem("Rules");
    private JMenuItem Reset = new JMenuItem("Reset");
    private JMenuItem Exit = new JMenuItem("Exit");

    // Create Sub-Menu for Difficulty
    private JMenuItem easy = new JMenuItem("easy");
    private JMenuItem medium = new JMenuItem("medium");
    private JMenuItem hard = new JMenuItem("hard");

    Game(){
        // title
        super("MineSweeper");

        // create board that is 10x10 (Medium Difficulty)
        board = new board(10,10);
        
        // add board and menu to frame
        add(board, BorderLayout.CENTER);
        add(menu, BorderLayout.PAGE_START);

        // JMenu to JMenuBar
        menu.add(Difficutly);
        menu.add(Options);

        // add JMenuItems to Options
        Options.add(Rules);
        Options.add(Reset);
        Options.add(Exit);

        // add JMenuItems to Difficulty
        Difficutly.add(easy);
        Difficutly.add(medium);
        Difficutly.add(hard);

        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset
                // remove old board
                // create a new board of buttons 5x5

            }
        });

        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset
                // Remove old board
                // create a new board of buttons 10x10
            }
        });

        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset
                // remove old board
                // create a new board of buttons 15x15
            }
        });

        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset the game
                board.reset();
            }
        });

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        getContentPane();
        setSize(800,800);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
}
