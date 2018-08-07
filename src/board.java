import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// The board and logic behind the game
public class board extends JPanel{

    private int row = 10, col = 10;
    private int numberOfBombs = 5;
    private int randomNumRow, randomNumCol;
    private buttons[][] buttons = new buttons[row][col];

    board(int row, int col){

        // create row and col
        this.row = row;
        this.col = col;

        // create 2D-array of buttons and add them to the board
        for(int i = 0; i < buttons.length; i++){
            for(int j = 0; j < buttons[i].length; j++){
                buttons[i][j] = new buttons();
                add(buttons[i][j]);
            }
        }

        setSize(600,600);
        setLayout(new GridLayout(row, col));
        setVisible(true);
    }

    // a function to reset the board
    public void reset(){
        for(int i = 0; i < buttons.length; i++){
            for(int j = 0; j < buttons[i].length; j++){
                buttons[i][j].setEnabled(true);
            }
        }
    }

    // if the user clicks a bomb then end the game and reveal all bombs
    public void endGame(){
        for(int i = 0; i < buttons.length; i++){
            for(int j = 0; j < buttons[i].length; j++){
                buttons[i][j].setEnabled(false);
            }
        }
    }

    // generates sets of random numbers and places a bomb in on that piece
    public void setBombs(){
        for(int i = 0; i < numberOfBombs; i++){ ;
            Random rand1 = new Random();
            Random rand2 = new Random();

            randomNumRow = rand1.nextInt(row - 1);
            randomNumCol = rand2.nextInt(col - 1);

            // if the user clicks that button then they will lose and all the bombs will be shown
            buttons[randomNumRow][randomNumCol].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    endGame();
                }
            });
            System.out.println(randomNumRow);
            System.out.println(randomNumCol);

        }
    }

    public int getNumberOfBombs() { return numberOfBombs; }

    public void setNumberOfBombs(int numberOfBombs) { this.numberOfBombs = numberOfBombs;}

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
