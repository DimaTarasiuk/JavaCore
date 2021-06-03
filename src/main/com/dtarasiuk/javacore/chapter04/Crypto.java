package main.com.dtarasiuk.javacore.chapter04;

import java.util.Scanner;

public class Crypto {


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int nuber = sn.nextInt(); //ввожу я сюда число 42
        int key = 12;             // любое число для шифрования
        int encryptedNumber = nuber ^ key;

        System.out.println(nuber);
        System.out.println("encrypted value: " + encryptedNumber);

        int decrypt = encryptedNumber ^ key;
        System.out.println("decrypted: " + decrypt);

        // ^ <- этот значек называется "побитовое исключающее OR" и вот как оно работает:
        // 1^0 = 1
        // 0^1 = 1
        // 0^0 = 0
        // 1^1 = 0
        // есть у нас к примеру такая штука
        //  101010 - 42
        // ^001100 - 12
        // после того как применятся 101010 ^
        //                           001100 получается следующее:
        //                           100110 - 38
        // наше число 42 в зашифрованом виде = 38


    }
}
