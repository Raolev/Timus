package Timus;

import java.util.Random;

public class timus_1068 {

    public static void main(String[] args){

        //Генерируем случайно число по условию
        int count = -10000;
        Random rnd = new Random(System.currentTimeMillis());
        count += rnd.nextInt(20001);

        int sumNum = 1;


        if(count == 0){

            System.out.println(sumNum);
            System.exit(0);

        }

        if(count > 0){

            for(int i = 2; i <= count; i ++){

                sumNum += i;

            }

            System.out.println(sumNum);
            System.exit(0);

        }
        if(count < 0){

            for(int i = -1; i >= count; i--){

                sumNum += i;

            }

            System.out.println(sumNum);
            System.exit(0);

        }


    }

}
