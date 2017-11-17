package ProgUA.Java02OOP.classWork.lesson04.UsingPrivatesDemo;

// Класс с главным методом программы:
class UsingPrivatesDemo{
    public static void main(String[] args){
// Создание объекта подкласса:
        Bravo obj=new Bravo(100);
// Проверка значения поля:
        obj.show();
// Присваивание значения полю:
        obj.set(200);
// Отображение значения поля:
        obj.show();
        //System.out.println(obj.code);
    }
}