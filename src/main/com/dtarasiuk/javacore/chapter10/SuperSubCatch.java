package main.com.dtarasiuk.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        }catch (Exception e){
            System.out.println("перехват исключения общего класса");
       /* }catch (ArithmeticException e){
            System.out.println("kod не допустим потому что обработано так как super class Exeption уже обработал");
        }*/
    }
}
}
