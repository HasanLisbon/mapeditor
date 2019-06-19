package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class Cell {
    public static final int CELL_SIZE=30;
    private int col;
    private int row;
    protected Rectangle rectangle;
    private boolean painted;

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
        rectangle.fill();
    }

    public void erase(){
        rectangle.delete();
    }
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int n){
        col=col+n;
    }

    public boolean isPainted() {
        return painted;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
    }
}
