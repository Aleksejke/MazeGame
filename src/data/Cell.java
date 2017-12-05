package data;

public class Cell {
    public int row, column;
    public boolean[] move;
    public Cell(int r, int c) {
        row = r;
        column = c;
        move = new boolean[4];
    }
    public boolean canMoveTo (Direction d) {
        return move[d.ordinal()];
    }

    @Override
    public String toString() {
        return "[" + row + "," + column + "]"
                + move[0] + " "
                + move[1] + " "
                + move[2] + " "
                + move[3] + " ";
    }

}
