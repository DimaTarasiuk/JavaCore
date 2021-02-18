package main.com.dtarasiuk.javacore.chapter05;

public class Search {
    public static void main(String[] args) {
        int nums[] = {7,6,5,4,5,6,7};
        int val = 5;
        boolean found = false;

        for (int x: nums){
            if(x==val){
                found = true;
            }
        }
        if(found) System.out.println("found");
    }
}
