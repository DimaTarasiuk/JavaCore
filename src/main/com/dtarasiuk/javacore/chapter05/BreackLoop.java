package main.com.dtarasiuk.javacore.chapter05;

public class BreackLoop {
    public static void main(String[] args) {
        for (int i =0; i<100; i++){
            if(i==10) break;
        }
        System.out.println("cycle is ended");
    }
}
