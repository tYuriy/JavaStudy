package ProgUA.Java01Start.homeWork.lesson08;

import java.util.Scanner;
/*
Напишите программу с классом, в котором есть символьное поле и метод, который возвращает значением код символа
*/
class newClass {
    char x;
    int returnXcode (char z){
        return (int)z;
    }
}

public class MethodReturnsSymbolCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        newClass nc = new newClass();
        System.out.println("Введите символ, если введено более одного символа, \nто программа отработает только по первому!");
        String str = scanner.nextLine();
        //String str = "fhello";
        nc.x = str.charAt(0);
        System.out.println("Код символа " + nc.x + " является " + nc.returnXcode(nc.x));
        ;
    }
}
