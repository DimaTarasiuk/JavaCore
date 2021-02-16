package main.com.dtarasiuk.javacore.chapter03;

class Dyninit {
    public static void main(String[] args) {
        double a = 3.0,
                b = 4.0;
// динамическая инициализация переменной с
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипoтeнyзa равна " + c);
    }
}