package ProgUA.Java02OOP.classWork.lesson04.HidingFieldDemo;

class Bravo extends Alpha{ // Подкласс
    String name; // Текстовое поле
    void show(){ // Метод для отображения значений полей
// Значение унаследованного из суперкласса поля:
        System.out.println("Из класса Alpha: "+super.name);
// Значение описанного в подклассе поля:
        System.out.println("Из класса Bravo: "+name);
    }
    Bravo(String a,String b){ // Конструктор
// Вызов конструктора (по умолчанию) суперкласса:
        super();
// Значение унаследованного из суперкласса поля:
        super.name=a;
// Значение описанного в подклассе поля:
        name=b;
    }
}