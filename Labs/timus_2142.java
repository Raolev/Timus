package Timus;

import java.util.Random;

public class timus_2142 {

    public static void main(String[] args){

        //Повторяем условие задачи генерируя два нужных числовых массива в нужных пределах
        Random rnd = new Random(System.currentTimeMillis());
        int[] str1 = new int[3];
        for (int i = 0; i < str1.length; i ++){
            str1[i] = rnd.nextInt(101);
            System.out.print(str1[i] + " ");
        }
        System.out.println();
        int[] str2 = new int[3];
        for (int i = 0; i < str2.length; i ++){
            str2[i] = rnd.nextInt(101);
            System.out.print(str2[i] + " ");
        }
        System.out.println();

        //Начинаем сравнивать ману и заклинания
        if (str1[2] < str2[2]){

            System.out.println("There are no miracles in life");
            System.exit(0);

        }

        if(str1[0] + str1[2] > str2[0] && str1[1] > str2[1]){

            System.out.println("It is a kind of magic");
            System.exit(0);

        }

        if(str1[0] > str2[0] && str1[1] + str1[2] > str2[1]){

            System.out.println("It is a kind of magic");
            System.exit(0);

        }

        System.out.println("There are no miracles in life");
        System.exit(0);

    }

}
