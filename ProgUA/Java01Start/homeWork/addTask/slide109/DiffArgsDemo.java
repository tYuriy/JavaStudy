package ProgUA.Java01Start.homeWork.addTask.slide109;

//        Написать функцию, которая принимает в качестве аргументов
//        одну строку X, целое число Y и число с плавающей точкой Z и
//        возвращает как результат строку в виде
//        S = x + y + z.
public class DiffArgsDemo {
    public static void main(String[] args) {

        System.out.println(doString("Excel", 2017, 1.24));
    }
    static String doString (String s, int n, double d){
        return s+ "\t"+n+ "\t"+d;
    }
}
