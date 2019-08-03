package org.academiadecodigo.bootcamp.mapeditor;

import java.io.*;

public class FileManager {



    public static String load(){
            String line;
            String result="";
        try {
            BufferedReader bReader=new BufferedReader(new FileReader("resources/bin.txt"));
            while((line = bReader.readLine())!=null){
                result+=line+"\n";
            }
            bReader.close();
            System.out.println(result);
        }catch(FileNotFoundException ex){
            System.out.println("File not found exception while loading");
        }catch (IOException ex){
            System.out.println("IO Exception while loading");
        }
        return result;
    }

    public static void save(String bin){
        try {
            BufferedWriter bWriter=new BufferedWriter(new FileWriter("resources/bin.txt"));
        bWriter.write(bin);
        bWriter.close();
        }catch (FileNotFoundException ex){
            System.out.println("This is File not found exception");
        }catch (IOException e){
            System.out.println("This is the IO exception");
        }
    }
}
