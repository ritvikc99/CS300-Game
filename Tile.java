/* Author: Forrest Daggett
    Date: 1/25/20
--------------------------------------
    Tile class for the game. Feel free to change this as much as we need

    TODO:
     -Add visit flag
     -Add movment speed requirements
     -Maybe make this an abstract base class
*/

import java.awt.*;

//Contains the type in an int and tests with the enums from the tiles.java file
public class Tile {
    private Types type; //Type of tile
    private int X, Y; //Coordinates of grid
    private int line_width; //Width of the grid lines

    //Constructor
    Tile(Types type, int x, int y) {
        this.type = type;
        this.X = x;
        this.Y = y;
        this.line_width = 50; //hard-coded for now
    }

    public void draw(Graphics2D g2d) {
        //calculate position
        int x = X*line_width;
        int y = Y*line_width;

        //Fill in squares by color
        //TODO: Draw graphics instead of flat colors (maybe lol)
        switch (type) {
            case FOREST:
                g2d.setColor(Color.GREEN);
                break;
            case SWAMP:
                g2d.setColor(Color.DARK_GRAY);
                break;
            case DESERT:
                g2d.setColor(Color.YELLOW);
                break;
            case WATER:
                g2d.setColor(Color.BLUE);
                break;
            case MOUNTAINS:
                g2d.setColor(Color.GRAY);
                break;
            case SHOPKEEPER:
                g2d.setColor(Color.magenta);
                break;
            case CAVERNS:
                g2d.setColor(Color.BLACK);
                break;
            default:
                g2d.setColor(Color.WHITE);
        }
        //Fill color
        g2d.fillRect(x,y,line_width,line_width);
        //Draw rectangle (for the grid)
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x,y,line_width,line_width);
    }

}