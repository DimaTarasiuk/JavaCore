package main.com.dtarasiuk.javacore.chapter03;

public class Promote {

    public static void main(String[] args) {
        byte b = 42;
        char c = 'а' ; // 1072 unicode
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234 ;


        double result = (f * b) + (i/c) - (d * s );
        System.out.println((f * b) + "+" + (i / c));
        System.out.println("result = " + "" + result);



    }


}
