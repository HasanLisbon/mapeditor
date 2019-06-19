package org.academiadecodigo.bootcamp.mapeditor;

import java.awt.*;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {
    private  static int cols;
    private  static int rows;
    private static Cell[][] cells;
    private static Rectangle canvas;

    public Grid(int cols, int rows){
        this.cols=cols;
        this.rows=rows;
        cells=new Cell[cols][rows];

        canvas= new Rectangle(0,0, cols,rows);
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

    public static Cell getCells(int col, int row){
        return cells[col][row];
    }
    public static int getCols() {
        return cols;
    }

    public static int getRows () {
        return rows;
    }
    public static void setRow(int n){
        cols=n;
    }

    public static void setCol(int n){
        cols=n;
    }

}
