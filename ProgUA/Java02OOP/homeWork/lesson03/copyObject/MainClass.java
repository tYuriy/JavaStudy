package ProgUA.Java02OOP.homeWork.lesson03.copyObject;
/*
Напишите программу с классом, в котором есть поле - целочисленный массив.
Опишите перегруженный статический метод, который на основании объекта
данного класса возвращает копию массива (из данного объекта),
а на основании переданного аргументом массива
создает объект соответствующего класса. (Java_OOP_01 с.56)
 */
public class MainClass {
    public static void main(String[] args) {
        //создаем экземпляр класса, который будет аргументом для метода
        IntArrayFieldClass arr1 = new IntArrayFieldClass();

        //выводим массив, возвращаемый методом
        System.out.println("Массив, который возвращает метод: ");
        for (int s: IntArrayFieldClass.copyObj(arr1)){
            System.out.print(s + "\t");
        }
        System.out.println();

        //выводим адреса созданных объектов
        System.out.println("Адрес существующего объекта: " + arr1);
        System.out.println("Адрес объекта, созданного методом: " + IntArrayFieldClass.copyObj(arr1.getIntArr()));
    }
}
