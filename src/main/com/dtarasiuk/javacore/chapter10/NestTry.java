package main.com.dtarasiuk.javacore.chapter10;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42/a;
            System.out.println("a = " + a);
            try {
                /* Если указан один аргумент командной строки ,
то исключение в связи с делением на нуль
буде т сгенерировано в следующем коде . */
                if (a == 1) a=a / (a-a);
                /* Если указаны два аргумента командной строки ,
то генерируется исключение в связи с выходом
за пределы массива . */
                if (a == 2){
                    int c[] = {1};
                    c[42] = 99;
                }
            }   catch (ArrayIndexOutOfBoundsException e){
                System.out.println("за пределами массива" + e);
            }
        }catch (ArithmeticException e){
            System.out.println("деление на ноль " + e);
        }
    }
}
