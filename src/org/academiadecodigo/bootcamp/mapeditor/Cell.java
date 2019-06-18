package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class Cell {
    public static final int CELL_SIZE=30;
    private int col;
    private int row;
    private Rectangle rectangle;

    public Cell(int col, int row){
       this.col=col;
       this.row=row;
       rectangle= new Rectangle(col*CELL_SIZE,row*CELL_SIZE,CELL_SIZE,CELL_SIZE);

    }

    public void show(){
        rectangle.draw();
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void paint(){

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
