package main.com.dtarasiuk.javacore.chapter04;

public class BiteShift {
    public static void main(String[] args) {
        byte a= 64;
        byte b;
        int i;

        System.out.println(a);
        i = a << 2;
        b = (byte) (a<<2);

        System.out.println("Пepвoнaчaльнoe значение а: " + a);
        System.out.println("i and b: " + i + " " + b);

    }
}
