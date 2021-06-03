package main.com.dtarasiuk.javacore.chapter10;

public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("demonstration");
        }catch (NullPointerException e){
            System.out.println("Исключение перехвачено в теле метода demoproc ()." + e);
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e) {
            System.out.println("повторный пеехват " + e);
        }
    }
}
