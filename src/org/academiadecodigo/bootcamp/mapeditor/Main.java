package org.academiadecodigo.bootcamp.mapeditor;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        /*Rectangle rectangle= new Rectangle(0,0,30,30);
        Rectangle rectangle1;
        rectangle.draw();
        int pos=0;
        while(pos<rectangle.getWidth()){
            rectangle1=new Rectangle(pos,0, 10,10);
            rectangle1.draw();
            pos+=10;
        }*/

        Grid grid=new Grid(40,40);
        Pointer pointer=new Pointer();
        System.out.println(pointer.getCol());



    }
}
