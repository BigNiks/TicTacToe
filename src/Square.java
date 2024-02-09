import java.awt.*;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {
    private TicTacToeViewer t;
    private String marker;
    private int size;
    private int row;
    private int col;
    private boolean isWinningSquare;

    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     *
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col, TicTacToeViewer v) {
        this.row = row;
        this.col = col;
        this.size = 150;
        t = v;

        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     *
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }

    public void draw(Graphics g) {
        g.setColor(Color.black);
        if (row == 0 && col == 0) {
            g.drawRect(75, 75, size, size);
            if (getMarker().equals("X")) {
                g.drawImage(t.getImage(1), 75, 75,size,size, t);
            } else if (getMarker().equals("O")) {
                g.drawImage(t.getImage(0), 75, 75,size,size, t);
            }
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.drawRect(75, 75, size, size);
            }
        } else if (row == 0 && col == 1) {
            g.drawRect(225, 75, size, size);
            if (getMarker().equals("X")) {
                g.drawImage(t.getImage(1), 225, 75,size,size, t);
            } else if (getMarker().equals("O")) {
                g.drawImage(t.getImage(0), 225, 75,size,size, t);
            }
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.drawRect(225, 75, size, size);
            }
        } else if (row == 0 && col == 2) {
            g.drawRect(375, 75, size, size);
            if (getMarker().equals("X")) {
                g.drawImage(t.getImage(1), 375, 75,size,size, t);
            } else if (getMarker().equals("O")) {
                g.drawImage(t.getImage(0), 375, 75,size,size, t);
            }
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.drawRect(375, 75, size, size);
            }
        } else if (row == 1 && col == 0) {
            g.drawRect(75, 225, size, size);
            if (getMarker().equals("X")) {
                g.drawImage(t.getImage(1), 75, 225,size,size, t);
            } else if (getMarker().equals("O")) {
                g.drawImage(t.getImage(0), 75, 225,size,size, t);
            }
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.drawRect(75, 225, size, size);
            }
        } else if (row == 2 && col == 0) {
            g.drawRect(75, 375, size, size);
            if (getMarker().equals("X")) {
                g.drawImage(t.getImage(1), 75, 375,size,size, t);
            } else if (getMarker().equals("O")) {
                g.drawImage(t.getImage(0), 75, 375,size,size, t);
            }
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.drawRect(75, 375, size, size);
            }
        } else if (row == 1 && col == 1) {
            g.drawRect(225, 225, size, size);
            if (getMarker().equals("X")) {
                g.drawImage(t.getImage(1), 225, 225,size,size,t);
            } else if (getMarker().equals("O")) {
                g.drawImage(t.getImage(0), 225, 225,size,size, t);
            }
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.drawRect(225, 225, size, size);
            }
        } else if (row == 2 && col == 2) {
            g.drawRect(375, 375, size, size);
            if (getMarker().equals("X")) {
                g.drawImage(t.getImage(1), 375, 375,size,size, t);
            } else if (getMarker().equals("O")) {
                g.drawImage(t.getImage(0), 375, 375,size,size, t);
            }
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.drawRect(375, 375, size, size);
            }
        } else if (row == 1 && col == 2) {
            g.drawRect(225, 375, size, size);
            if (getMarker().equals("X")) {
                g.drawImage(t.getImage(1), 225, 375,size,size, t);
            } else if (getMarker().equals("O")) {
                g.drawImage(t.getImage(0), 225, 375,size,size, t);
            }
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.drawRect(225, 375, size, size);
            }
        } else if (row == 2 && col == 1) {
            g.drawRect(375, 225, size, size);
            if (getMarker().equals("X")) {
                g.drawImage(t.getImage(1), 375, 225,size,size, t);
            } else if (getMarker().equals("O")) {
                g.drawImage(t.getImage(0), 375, 225,size,size, t);
            }
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.drawRect(375, 225, size, size);
            }
        }

    }
}

