package Timus;

import java.util.Scanner;

public class timus_1877 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String stringFirstLock;
        String stringSecondLock;

        int firstLock;
        int secondLock;

        System.out.println("Введите четырёзначный код от первого замка");
        stringFirstLock = scan.nextLine();

        System.out.println("Введите четырёхзначный код от второго замка");
        stringSecondLock = scan.nextLine();

        firstLock = Integer.parseInt(stringFirstLock);
        secondLock = Integer.parseInt(stringSecondLock);

        for(int i = 0; i < 10000; i++ ) {

            if (firstLock == i) {
                System.out.println("yes");
                System.exit(0);
            }

            i++;

            if (secondLock == i) {
                System.out.println("yes");
                System.exit(0);
            }

        }
        System.out.println("no");

    }

}
