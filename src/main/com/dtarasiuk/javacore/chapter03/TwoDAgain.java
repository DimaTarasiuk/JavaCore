package main.com.dtarasiuk.javacore.chapter03;

public class TwoDAgain {
    public static void main(String args[]) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[10];
        twoD[1] = new int[20];
        twoD[2] = new int[30];
        twoD[3] = new int[40];

        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }


        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(twoD[i][j] + " ");
                System.out.println();
            }
        }
    }//TODO
}