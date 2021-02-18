package main.com.dtarasiuk.javacore.chapter05;

public class MissingBreak {
    public static void main(String[] args) {
        for (int i =0; i<12;i++){
            switch (i){
                case 0:
                    System.out.println("no brake");
                case 1:
                    System.out.println("no brake");
                case 2:
                    System.out.println("no brake");
                case 3:
                    System.out.println("no brake");
                case 4:
                    System.out.println("i less them 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i less then 10");
                    break;
                default:
                    System.out.println("i is or more then 10");
            }
        }
    }
}
