package org.academiadecodigo.bootcamp.mapeditor;

import java.util.Random;

public class Randomizer {

    public static int random(){
        Random random=new Random();
        int randomNum=10*random.nextInt(3);
        return randomNum;
    }
}
