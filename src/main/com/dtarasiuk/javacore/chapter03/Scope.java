package main.com.dtarasiuk.javacore.chapter03;

public class Scope {

    public static void main(String[] args) {
        int x; // эта переменная доступна всему коду из метода main()
        x = 10;


        if (x == 10) {// начало новой области действия ,
            int у = 20; // доступной только этому блоку кода


            // обе переменные х и у доступны в э той области действия
            System.out.println(" x и у: " + x + " " + у);
            x = у * 2;
        }
// у= 100; // ОШИБКА ! переменная у недоступна
// в этой области действия , тогда как
// переменная х доступна и эдесь
        System.out.println(" x равно " + x);
    }
}
