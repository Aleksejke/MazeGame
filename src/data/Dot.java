package data;

public class Dot {
    public String name;
    public Cell place;
    public Maze maze;
    public Dot (String n, Cell p, Maze m) {
        name = n;
        place = p;
        maze = m;
    }
    
 public boolean goTo (Direction d) {
        if(place.canMoveTo(d)) {
            Cell newPlace = null;
            if (d != null) {
                if (d == Direction.UP)
                    newPlace = maze.getCells(place.row - 1, place.column);
                if (d == Direction.RIGHT)
                    newPlace = maze.getCells(place.row, place.column + 1);
                if (d == Direction.DOWN)
                    newPlace = maze.getCells(place.row + 1, place.column);
                if (d == Direction.LEFT)
                    newPlace = maze.getCells(place.row, place.column - 1);
            }
            place = newPlace;
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println(name + " at : [" +place.row + "," + place.column + "]");
    }  

    public Cell getPlace() {
        return place;
    }
    
    
}
