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


        canvas= new Rectangle(0,0, cols*Cell.CELL_SIZE,rows*Cell.CELL_SIZE);
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

   public static String getCellsBin(){
        String cellsBin="";
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                if(cells[col][row].isPainted()){
                    cellsBin+='1';
                }else{
                    cellsBin+='0';
                }
            }
            cellsBin+="\n";
        }
        return cellsBin;
   }


   public static void loadGrid(){
        String binFil=FileManager.load();
       System.out.println(binFil);
        int index=0;
            for(int row=0; row<rows;row++){
                System.out.println("looping through row");
                for(int col=0; col<cols; col++){
                    System.out.println("looping through column");
                    if(binFil.charAt(index)=='0'){
                        cells[col][row].erase();
                    }else{
                        cells[col][row].paint();
                    }
                    System.out.println("Has ended one row..going to increase index");
                    index++;
                }
                index++;
            }

   }

    public static Cell[][] getAllCells() {
        return cells;
    }

    public static Cell getCells(int col, int row){
        return cells[col][row];
    }


    public static int getCols() {
        return canvas.getWidth();
    }

    public static int getRows() {
        return canvas.getHeight();
    }
}
