package main.com.dtarasiuk.javacore.chapter05;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int x: nums) {
            System.out.println("значение равно:"  + x);
            sum += x;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
