package main.com.dtarasiuk.javacore.chapter03;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println(" \nПpeoбpaзoвaниe типа int в тип byte."); //Когда значение 257 приводитсяк типу byte,
                                                                        // его результатом будет остаток от деления 257 на 256
                                                        // (диапазон допустимых значений типа byte) , который в данном случае равен 1.
        b = (byte) i;
        System.out.println("i и b " + i + " " + b);

        System.out.println(" \nПpeoбpaзoвaниe типа douЫe в тип int.");
        i = (int) d;
        System.out.println("d и i " + d + "" + i);
        System.out.println(" \nПpeoбpaзoвaниe типа douЫe в тип byte.");
        b = (byte) d;
        System.out.println("d и Ь " + d + " " + b);
    }
}
