package main.com.dtarasiuk.javacore.chapter05;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Outmn";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Summer";
        } else {
            season = "somth new ones O_o";
        }
        System.out.println("April relates to " + season);
    }
}
