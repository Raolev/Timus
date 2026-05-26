package Timus;

import java.util.Random;

public class timus_1585 {

    public static void main(String[] args){

        //Генерируем количство пингвинов и выделяем место в массиве под них
        Random rnd = new Random(System.currentTimeMillis());
        int penguins = rnd.nextInt(1000);
        penguins ++;
        String[] names = new String[penguins];
        int countEmperor = 0;
        int countLittle = 0;
        int countMacaroni = 0;

        //Создаём список пингвинов и выводим их количество
        System.out.println(penguins);
        for(int i = 0; i < penguins; i++ ){

            int num = rnd.nextInt(3);
            if(num == 0){
                names[i] = "Emperor Penguin";
            }
            if(num == 1){
                names[i] = "Little Penguin";
            }
            if(num == 2){
                names[i] = "Macaroni Penguin";
            }
            System.out.println(names[i]);

        }

        //Вычисляем сколько пенгвинов каждоого вида в списке
        for(int i = 0; i < penguins; i++ ){

            if("Emperor Penguin".equals(names[i])){
                countEmperor++;
            }
            if("Little Penguin".equals(names[i])){
                countLittle++;
            }
            if("Macaroni Penguin".equals(names[i])){
                countMacaroni++;
            }

        }
        System.out.println();
        //Выводим самый популярный виды
        if (countMacaroni > countLittle && countMacaroni > countEmperor){

            System.out.println("Macaroni Penguin");
            System.exit(0);

        }
        if (countEmperor > countMacaroni && countEmperor > countLittle){

            System.out.println("Emperor Penguin");
            System.exit(0);

        }
        if (countLittle > countMacaroni && countLittle > countEmperor){

            System.out.println("Little Penguin");
            System.exit(0);

        }

        System.out.println("Нельзя однозначно определить какой вид преобладает");
        System.exit(0);

    }

}
