package org.academiadecodigo.bootcamp.mapeditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.bootcamp.mapeditor.Grid;
public class Pointer  extends Cell implements KeyboardHandler {
    private int col=getCol();
    private int row=getRow();
    private int newCol;
    private int newRow;
    private boolean paint=true;
    Grid grid;
    public Pointer() {
        super(0, 0);
        show();
        keyMove();
    }

    public void moveUp(){

            rectangle.translate(getCol(), CELL_SIZE*-1);
        System.out.println("Rectangle x"+ rectangle.getX()+ " Rectangle y "+ rectangle.getY());
    }
    public void moveDown(){
            rectangle.translate(col, CELL_SIZE);
        System.out.println("Rectangle x"+ rectangle.getX()+ " Rectangle y "+ rectangle.getY());
    }

    public void moveRight(){
            rectangle.translate(CELL_SIZE,row);
        System.out.println("Rectangle x"+ rectangle.getX()+ " Rectangle y "+ rectangle.getY());
    }

    public void moveLeft(){
            rectangle.translate(-1* CELL_SIZE, row);
        System.out.println("Rectangle x"+ rectangle.getX()+ " Rectangle y "+ rectangle.getY());
    }
    public void keyMove(){
        Keyboard keyboard= new Keyboard(this);
        KeyboardEvent eventLeft= new KeyboardEvent();
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventLeft);

        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventRight);


        KeyboardEvent eventUp= new KeyboardEvent();
        eventUp.setKey(KeyboardEvent.KEY_UP);
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventUp);

        KeyboardEvent eventDown= new KeyboardEvent();
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventDown);

        KeyboardEvent eventPaint= new KeyboardEvent();
        eventPaint.setKey(KeyboardEvent.KEY_SPACE);
        eventPaint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventPaint);

        KeyboardEvent eventErase= new KeyboardEvent();
        eventErase.setKey(KeyboardEvent.KEY_D);
        eventErase.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventErase);
    }

    @Override
    public void show() {
        super.show();
        super.getRectangle().setColor(Color.GREEN);
        super.getRectangle().fill();

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey()== KeyboardEvent.KEY_LEFT){
            if(rectangle.getX()>0) {
                moveLeft();
            }
        }

        if(keyboardEvent.getKey()==KeyboardEvent.KEY_RIGHT){
            if(rectangle.getX()<Grid.getCols()-CELL_SIZE) {
                moveRight();
            }
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP){
            if(rectangle.getY()>0) {
                moveUp();
            }
        }
        if(keyboardEvent.getKey()== KeyboardEvent.KEY_DOWN){
            if(rectangle.getY()<Grid.getRows()-CELL_SIZE) {
                moveDown();
            }
        }
        if(keyboardEvent.getKey()== KeyboardEvent.KEY_SPACE){
                Grid.getCells(rectangle.getX() / CELL_SIZE, rectangle.getY() / CELL_SIZE).paint();
                return;
        }

        if(keyboardEvent.getKey()==KeyboardEvent.KEY_D){
                Grid.getCells(rectangle.getX() / CELL_SIZE, rectangle.getY() / CELL_SIZE).show();
                return;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
