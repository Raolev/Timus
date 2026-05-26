package Timus;

import java.util.Random;

public class timus_2066 {

    public static void main(String[] args){

        Random rnd = new Random(System.currentTimeMillis());
        int a = 0;
        int b = -1;
        int c = -1;

        //Роллим числа, пока нам не выпадут нужные
        a = rnd.nextInt(99);
        while(b < a){

            b = rnd.nextInt(100);

        }
        while(c < b){

            c = rnd.nextInt(101);

        }

        a = a - b*c;
        System.out.println(a);

    }
}
