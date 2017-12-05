package data;

import java.util.ArrayList;

public class Maze {
    public int numOfRows, numOfColumns;
    public Cell[][] cells;
    public ArrayList <Dot> dots;
    public Maze (int r, int c) {
        cells = new Cell[r][c];
        numOfRows = r;
        numOfColumns = c;
        dots = new ArrayList();
        //creation of the maze
        for(int i = 0; i < numOfRows; i++)
            for (int j = 0; j < numOfColumns; j++)
                cells[i][j] = new Cell(i, j);
    }

    public void removeWall(int r, int c, Direction d) {
        //removing the wall(s) for the main cell
        if((r >= 0) && (r < numOfRows) && (c >= 0) && (c < numOfColumns)) {
            if ((r != 0) && (r != numOfRows - 1)) {
                if ((c != 0) && (c != numOfColumns - 1)) {
                    if (cells[r][c].move[d.ordinal()] == false)
                        cells[r][c].move[d.ordinal()] = true;
                }
                if ((c == 0) && (d != Direction.LEFT) || ((c == numOfColumns - 1) && (d != Direction.RIGHT)))
                    if (cells[r][c].move[d.ordinal()] == false)
                            cells[r][c].move[d.ordinal()] = true;
            }
                if (((r == 0) && (d != Direction.UP)) || ((r == numOfRows - 1) && (d != Direction.DOWN))) {
                    if (cells[r][c].move[d.ordinal()] == false)
                        cells[r][c].move[d.ordinal()] = true;
                    if ((c == 0) && (d == Direction.LEFT) || ((c == numOfColumns - 1) && (d == Direction.RIGHT)))
                        if (cells[r][c].move[d.ordinal()] == true)
                            cells[r][c].move[d.ordinal()] = false;
                }
        }
        //removing the wall(s) from the neighbours side
        if (d == Direction.UP)
            if ((r != 0) && (r < numOfRows))
                if (cells[r-1][c].move[Direction.DOWN.ordinal()] == false)
                    cells[r-1][c].move[Direction.DOWN.ordinal()] = true;
        if (d == Direction.RIGHT)
            if ((c != numOfColumns - 1) && (c >= 0))
                if (cells[r][c+1].move[Direction.LEFT.ordinal()] == false)
                    cells[r][c+1].move[Direction.LEFT.ordinal()] = true;
        if (d == Direction.DOWN)
            if ((r != numOfRows - 1) && (r >= 0))
                if (cells[r+1][c].move[Direction.UP.ordinal()] == false)
                    cells[r+1][c].move[Direction.UP.ordinal()] = true;
        if (d == Direction.LEFT)
            if ((c != 0) && (c < numOfColumns))
                if (cells[r][c-1].move[Direction.RIGHT.ordinal()] == false)
                    cells[r][c-1].move[Direction.RIGHT.ordinal()] = true;

    }

    public void addWall(int r, int c, Direction d) {
        if((r >= 0) && (r < numOfRows) && (c >= 0) && (c < numOfColumns)) {
            Cell currentCell = cells[r][c];
            currentCell.move[d.ordinal()] = false;
            //adding walls from the side of neighbours of currentCell
            if (d == Direction.UP)
                if ((r != 0) && (r < numOfRows))
                    cells[r-1][c].move[Direction.DOWN.ordinal()] = false;
            if (d == Direction.RIGHT)
                if ((c != numOfColumns - 1) && (c >= 0))
                    cells[r][c+1].move[Direction.LEFT.ordinal()] = false;
            if (d == Direction.DOWN)
                if ((r != numOfRows - 1) && (r >= 0))
                    cells[r+1][c].move[Direction.UP.ordinal()] = false;
            if (d == Direction.LEFT)
                if ((c != 0) && (c < numOfColumns))
                    cells[r][c-1].move[Direction.RIGHT.ordinal()] = false;
        }
    }

    public void print(){
       for(int i = 0; i < numOfRows; i++) {
           for (int j = 0; j < numOfColumns; j++)
               System.out.print(cells[i][j] + " ");
           System.out.println();
       }
       if (numOfRows == 0 && numOfColumns == 0)
           System.out.println("Maze is empty");
    }
    
    public Dot addDots (String n, int i, int j) {
        Dot d = new Dot (n, cells[i][j], this);
        dots.add(d);
        return d;
    }

    public ArrayList<Dot> getDots() {
        return dots;
    }
    
    public Cell getCells (int row, int column) {
        return cells[row][column];
    }
}
