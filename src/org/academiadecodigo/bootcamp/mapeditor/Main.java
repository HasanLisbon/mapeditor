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

        Grid grid=new Grid(20,20);
        Pointer pointer=new Pointer();

        FileManager fileManager=new FileManager();
        fileManager.save(Grid.getCellsBin());

        System.out.println(FileManager.load());

    }
}
