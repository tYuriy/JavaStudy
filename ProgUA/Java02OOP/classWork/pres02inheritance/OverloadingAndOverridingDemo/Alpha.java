package ProgUA.Java02OOP.classWork.pres02inheritance.OverloadingAndOverridingDemo;

class Alpha{ // Суперкласс
    void show(){ // Версия метода без аргумента
        System.out.println("Класс Alpha");
    }
    void show(String txt){ // Версия метода с текстовым аргументом
        System.out.println(txt);
    }
}