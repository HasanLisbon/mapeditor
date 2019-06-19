package org.academiadecodigo.bootcamp.mapeditor;

import java.io.*;

public class FileManager {

    public FileManager(){

    }

    public static void load(){


    }

    public static void save(String bin){
        try {
            BufferedWriter bWriter=new BufferedWriter(new FileWriter("/Users/codecadet/workspace/Map-Editor/resources/bin.txt"));
        bWriter.write(bin);
        bWriter.close();
        }catch (FileNotFoundException ex){
            System.out.println("This is File not found exception");
        }catch (IOException e){
            System.out.println("This is the IO exception");
        }
    }
}
