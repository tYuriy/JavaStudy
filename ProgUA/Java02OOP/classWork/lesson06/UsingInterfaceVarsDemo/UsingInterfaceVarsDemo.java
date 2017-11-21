package ProgUA.Java02OOP.classWork.lesson06.UsingInterfaceVarsDemo;

class UsingInterfaceVarsDemo{
    public static void main(String[] args){
// Интерфейсная переменная:
        Base ref;
// Объект класса Alpha:
        ref=new Alpha("текст");
        ref.show();
// Объект класса Bravo:
        ref=new Bravo(123);
        ref.show();
    }
}