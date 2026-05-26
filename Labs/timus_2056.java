package Timus;

import java.util.Random;

public class timus_2056 {

    public static void main(String[] args){

        //Генерируем количество оценок
        Random rnd = new Random(System.currentTimeMillis());
        int count = rnd.nextInt(10);
        count++;
        int[] evaluations = new int[count];
        float middle = 0;

        //Записываем их в массив и выводим на экран
        for(int i = 0; i < count; i++){

            int oneEvaul = rnd.nextInt(3);
            oneEvaul += 3;
            evaluations[i] = oneEvaul;
            System.out.println(evaluations[i]);

        }

        //обрабатываем все случаи оценок
        for(int i = 0; i < count; i++){

            if(evaluations[i] == 3){
                System.out.println("None");
                System.exit(0);
            }
            middle += evaluations[i];

        }

        //Вычисляем среднее число и округляем до десятых
        middle /= count;
        middle *= 1000;
        middle /= 1000;

        if(middle == 5){

            System.out.println("Named");
            System.exit(0);

        }

        if(middle >= 4.5){

            System.out.println("High");
            System.exit(0);

        }

        System.out.println("Common");
        System.exit(0);

    }
}
