package Timus;

import java.util.Scanner;

public class timus_1005 {

    public static void main(String[] args){

        int rocks;
        int weight;
        String str;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число камней и вес каджого камня через пробел");

        str = scan.nextLine();
        String[] s = str.split(" ");
        rocks = Integer.parseInt(s[0]);
        weight = Integer.parseInt(s[1]);


        if(rocks % 2 == 0){

            System.out.println(0);

        } else {

            System.out.println(weight);

        }

    }
}
