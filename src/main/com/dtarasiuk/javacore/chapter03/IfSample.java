package main.com.dtarasiuk.javacore.chapter03;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y)
            System.out.println("x less than y");

        x = x * 2;
        if (x == y)
            System.out.printf("x is y now");

        x = x * 2;
        if (x > y)
            System.out.println("x more than y");

        if (x == y)
            System.out.println("nothing to see");

    }
}
