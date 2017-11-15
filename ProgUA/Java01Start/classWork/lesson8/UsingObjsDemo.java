package ProgUA.Java01Start.classWork.lesson8;

// Описание класса:
class MyClass{
    // Поле:
    int num;
    // Метод:
    void show(){
        System.out.println("Поле num: "+num);
    }
} // Класс с главным методом:
public class UsingObjsDemo {
    // Главный метод:
    public static void main(String[] args){
// Первый объект:
        MyClass A=new MyClass();
// Объектная переменная:
        MyClass B;
// Второй объект:
        B=new MyClass();
// Присваивание значений полям объектов:
        A.num=123;
        B.num=321;
// Вызов методов:
        A.show();
        B.show();
    }
}
