package ProgUA.Java01Start.classWork.lesson8;


// Описание класса:
class MyClass2{
    // Поле:
    int num;
    // Метод:
    void show(){
        System.out.println("Поле num: "+num);
    }
} // Класс с главным методом:
public class CopyObjsDemo {
    // Главный метод:
    public static void main(String[] args){
// Объектные переменные:
        MyClass2 A,B;
// Создание объекта:
        A=new MyClass2();
// Присваивание объектных переменных:
        B=A;
// Присваивание значений полям и вызов методов:
        A.num=111;
        B.show();
        B.num=222;
        A.show();
    }
}
