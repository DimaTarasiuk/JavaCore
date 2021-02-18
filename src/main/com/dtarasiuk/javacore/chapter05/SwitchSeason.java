package main.com.dtarasiuk.javacore.chapter05;

public class SwitchSeason {
    static int month = 4;
    static String season;

    public static void main(String[] args) {
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
        }
        System.out.println(season);
    }
}
