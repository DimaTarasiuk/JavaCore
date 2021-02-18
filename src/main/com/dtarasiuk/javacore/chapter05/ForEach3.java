package main.com.dtarasiuk.javacore.chapter05;

public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];
        // присвоить значение элементам массива DUlllS
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + j) * (j + 1);
        // исполь зовать цикл for в стиле for each для
        // вывода и суммирования значений
        for (int х[] : nums) {
            for (int у : х) {
                System.out.println(" Знaчeниe равно : " + у);
                sum += у;
                System.out.println("Cyммa : " + sum);
            }
        }
    }
}//todo