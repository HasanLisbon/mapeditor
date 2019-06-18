package org.academiadecodigo.bootcamp.mapeditor;

import java.awt.*;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {
    private  int cols;
    private  int rows;
    Cell[][] cells;

    public Grid(int cols, int rows){
        this.cols=cols;
        this.rows=rows;
        cells=new Cell[cols][rows];

        Rectangle canvas= new Rectangle(0,0, cols*Cell.CELL_SIZE,rows*Cell.CELL_SIZE);
        canvas.draw();
        createGrid();
    }

    public void createGrid(){
       for(int col=0; col<cols; col++){
           for(int row=0; row<rows; row++){
               cells[col][row]=new Cell(col,row);
               cells[col][row].show();
           }
       }

    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
}
