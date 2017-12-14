package ProgUA.Java02OOP.classWork.pres01oop.lesson01;

// Класс со статическими членами:
class MyClass4{
    // Статическое поле:
    static int count=0;
    // Конструктор без аргументов:
    MyClass4(){
// Увеличение значения статического поля:
        count++;
// Отображение сообщения:
        System.out.println("Создан объект номер "+count);
    }
    // Статический метод:
    static void show(){
        System.out.println("Количество объектов: "+count);
    }
}
// Продолжение на следующем слайде!!!
// Класс с главным методом программы:
class UsingStaticMembersDemo{
    // Главный метод программы:
    public static void main(String[] args){
// Вызов статического метода:
        MyClass4.show();
// Создание объектов:
        MyClass4 objA=new MyClass4();
        MyClass4 objB=new MyClass4();
        MyClass4 objC=new MyClass4();
// Вызов статического метода через ссылку на класс:
        MyClass4.show();
// Вызов статического метода через ссылку на объект:
        objC.show();
        objB.show();
    }
}
