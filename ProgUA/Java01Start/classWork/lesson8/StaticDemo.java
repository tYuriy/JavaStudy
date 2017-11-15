package ProgUA.Java01Start.classWork.lesson8;

class MyClass5{
    // Статическое поле:
    static int code=100;
    // Статический метод:
    static void show(){
        System.out.println("Поле code: "+code);
    }
}
public class StaticDemo {
    public static void main(String[] args){
        // Вызов статического метода:
        MyClass5.show();
        // Обращение к статическому полю:
        MyClass5.code=200;
        // Вызов статического метода:
        MyClass5.show();    }
}
