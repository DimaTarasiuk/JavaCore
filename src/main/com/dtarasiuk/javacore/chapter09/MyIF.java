package main.com.dtarasiuk.javacore.chapter09;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Obj of String type";
    }
}
