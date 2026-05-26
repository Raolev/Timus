package Timus;

import java.util.Scanner;
import java.util.Random;

public class timus_2012 {

    public static void main(String[] args){

        Random rnd = new Random(System.currentTimeMillis());
        Scanner scan = new Scanner(System.in);

        int questions = rnd.nextInt(12);
        System.out.println("Хочет решить задач: " + questions);
        questions = 12 - questions;

        int time = 240;
        if (questions * 45 > time){

            System.out.println("NO");

        } else {

            System.out.println("YES");

        }

    }
}
