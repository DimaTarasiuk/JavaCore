package main.com.dtarasiuk.javacore.chapter10;

public class MethNestTry {
    static void nesttry(int a){
        try {
            // вложенный блок оператора t:r:y
/* Если указан один аргумент командной строки ,
то исключение в связи с делением на нуль
будет сгенерировано в следующем коде . */
            if ( a== 1) a = a / (a-a) ; // деление на нуль
/* Если указаны два аргумента командной строки ,
то генерируется исключение в связи с выходом
за пределы массива .
*/
            if(a==2 ) {
                int с [] = { 1 };
                с[42] = 99; // эдесь генерируется исключение в связи
                            // с выходом за пределы массива

    }
}catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try {int a = args.length;
            int b = 42/a;
            nesttry(a);

        }catch (ArithmeticException e){
            System.out.println("деление на нуль " + e);
        }
    }
}


