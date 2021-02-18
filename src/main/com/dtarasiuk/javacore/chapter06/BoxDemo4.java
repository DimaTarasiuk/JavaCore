package main.com.dtarasiuk.javacore.chapter06;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.depth =10;
        mybox1.width = 15;
        mybox1.depth = 20;


        mybox2.depth =1;
        mybox2.width = 5;
        mybox2.depth = 2;

        vol = mybox1.volume();
        System.out.println("Обьем первого паралелепипеда" + vol);


        vol = mybox2.volume();
        System.out.println("Обьем второго паралелепипеда" + vol);
    }
}// page 170
