package Timus;

import java.util.Scanner;

public class timus_1150 {

    public static void main(String[] args){

        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество страниц в книге: ");
        int pages = scan.nextInt();
        int count ;
        int numberPage;
        int vrav;

        for( int i = 1; i <= pages; i++){

            count = Integer.toString(i).length();
            numberPage = i;

            for ( int p = 0; p < count; p++){

                vrav = numberPage % 10;
                numberPage = numberPage / 10;

                if(vrav == 0){

                    zero++;

                }
                if(vrav == 1){

                    one++;

                }
                if(vrav == 2){

                    two++;

                }
                if(vrav == 3){

                    three++;

                }
                if(vrav == 4){

                    four++;

                }
                if(vrav == 5){

                    five++;

                }
                if(vrav == 6){

                    six++;

                }
                if(vrav == 7){

                    seven++;

                }
                if(vrav == 8){

                    eight++;

                }
                if(vrav == 9){

                    nine++;

                }

            }


        }

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);

    }

}
