package main.com.dtarasiuk.javacore.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a  = args.length;
            System.out.println("a = " + a);
            int b  = 42/a;
            int c[] = {1};
            c [42] = 99;
        }catch (ArithmeticException e){
            System.out.println("деление на ноль " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка индексации за пределами массива " + e);
        }
        System.out.println("поле после блока кетч"); // что перехват исключений из подклассов должен следовать до перехвата исключений из суперклассо
    }
}
