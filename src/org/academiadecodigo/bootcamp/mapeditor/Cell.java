package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class Cell {
    public static final int CELL_SIZE=30;
    private int col;
    private int row;
    protected Rectangle rectangle;
    protected Rectangle blackRect;

    public Cell(int col, int row){
       this.col=col;
       this.row=row;
       rectangle= new Rectangle(col*CELL_SIZE,row*CELL_SIZE,CELL_SIZE,CELL_SIZE);

    }

    public void show(){
        rectangle.draw();
    }

    public void hide(){
        rectangle.delete();
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void paint(){
        rectangle.setColor(Color.BLACK);
        rectangle.fill();
        System.out.println("Paint");
    }



    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int n){
        this.row=n;
    }

    public void setCol(int n){
        this.col=n;
    }
}
