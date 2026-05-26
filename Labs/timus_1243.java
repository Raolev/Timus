package Timus;

import java.util.Random;

public class timus_1243 {

    public static void main(String[] args){

        Random rnd = new Random(System.currentTimeMillis());
        int items =  rnd.nextInt(1000);
        System.out.println("Количество предметов: " + items);
        System.out.println("Сколько достанется белоснежке: " + items%7);

    }

}
