package main.com.dtarasiuk.javacore.chapter05;

public class SimleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("first case " + i);
                    break;
                case 1:
                    System.out.println("second case " + i);
                    break;
                case 2:
                    System.out.println("third case " + i);
                    break;
                case 3:
                    System.out.println("fourth case " + i);
                    break;
                case 4:
                    System.out.println("fifth case " + i);
                    break;
                case 5:
                    System.out.println("sixth case " + i);
                    break;
            }
        }
    }
}
