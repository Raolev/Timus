package Timus;

import java.util.Scanner;

public class timus_2001 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String first;
        String second;
        String third;

        int a1;
        int b1;
        int a2;
        int b2;
        int a3;
        int b3;

        int berries2;
        int berries1;

        System.out.println("Ведите через пробел результаты первого взвешивангия");
        first = scan.nextLine();

        System.out.println("Ведите через пробел результаты второго взвешивангия");
        second = scan.nextLine();

        System.out.println("Ведите через пробел результаты третьего взвешивангия");
        third = scan.nextLine();

        String[] firstArray = first.split(" ");
        String[] secondArray = second.split(" ");
        String[] thirdArray = third.split(" ");

        a1 = Integer.parseInt(firstArray[0]);
        b1 = Integer.parseInt(firstArray[1]);
        a2 = Integer.parseInt(secondArray[0]);
        b2 = Integer.parseInt(secondArray[1]);
        a3 = Integer.parseInt(thirdArray[0]);
        b3 = Integer.parseInt(thirdArray[1]);

        berries2 = b1 - b2;
        berries1 = b3 - berries2 - b2;

        System.out.println(berries1 + " " + berries2);

    }

}
