package ProgUA.Java02OOP.classWork.lesson05.UsingInterfaceDemo;

// Класс реализует интерфейс:
class MyClass implements MyInterface{
    // Описание методов:
    public int getNumber(double x){
        return (int)x;
    }
    public char getSymbol(int n){
        return (char)('A'+n);
    }
} // Главный класс:
