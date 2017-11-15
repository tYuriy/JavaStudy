package ProgUA.Java02OOP.classWork.lesson01;

class MyClass2{
    int number;
    char symbol;
    // Метод с одним аргументом для присваивания значения полю number:
    void set(int n){
        number=n;
    }
    // Метод с одним аргументом для присваивания значения полю symbol:
    void set(char s){
        symbol=s;
    }
    // Метод с двумя аргументами для присваивания значений полям
// number и symbol:
    void set(int n,char s){
        set(n); // Присваивание значения полю number
        set(s); // Присваивание значения полю symbol
    }
    // Метод без аргументов для присваивания значений обеим полям:
    void set(){
// Присваивание значения 0 полю number
// и значения 'Z' полю symbol:
        set(0,'Z');
    } // Продолжение на следующем слайде!!!
    // Метод без аргументов для отображения
// значений полей объекта:
    void show(){
        System.out.println("Значения полей "+number+" и "+symbol);
    }
    // Метод с одним аргументом для отображения
// значений полей объекта:
    void show(String txt){
        System.out.println(txt+": значения полей "+number+" и "+symbol);
    }
    // Метод с двумя аргументами для отображения
// значений полей объекта:
    void show(String txt1,String txt2){
        System.out.println(txt1+": "+number);
        System.out.println(txt2+": "+symbol);
    }
} // Завершение описания класса MyClass!!!
// Продолжение на следующем слайде!!!
class MethodOverloadingDemo{
    public static void main(String[] args){
// Объявление объектных переменных и создание объектов:
        MyClass2 objA,objB;
        objA=new MyClass2();
        objB=new MyClass2();
// Присваивание значений полям первого объекта:
        objA.set(100);
        objA.set('A');
// Отображение значений полей первого объекта:
        System.out.println("Объект objA:");
        objA.show();
// Присваивание значений полям второго объекта:
        objB.set();
// Отображение значений полей второго объекта:
        objB.show("Объект objB");
// Изменение значения полей второго объекта:
        objB.set(200,'B');
// Проверка значений полей второго объекта:
        System.out.println("Объект objB после изменения:");
        objB.show("Число","Символ");
    }
}