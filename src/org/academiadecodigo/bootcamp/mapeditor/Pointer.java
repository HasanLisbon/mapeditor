package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
public class Pointer  extends Cell{
    private final int height=30;
    private final int width=30;
    private int col=0;
    private int row=0;
    private Grid grid;
    public Pointer() {
        super(0, 0);
        show();
    }

    public void moveUp(){
        if(col>0){
            col -=10;
        }
    }
    public void moveDown(){
        if(col <grid.getRows()){
            col +=10;
        }

    }

    public void moveRight(){
        if(row <grid.getCols()){
            row +=10;
        }

    }

    public void moveLeft(){
        if(row >0){
            row -=10;
        }

    }

    @Override
    public void show() {
        super.show();
        super.getRectangle().setColor(Color.GREEN);
        super.getRectangle().fill();

    }
}
