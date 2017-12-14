package ProgUA.Java02OOP.classWork.pres04generics.UsingGenericsDemo;

// Продолжение на следующем слайде!!!
// Главный класс:
class UsingGenericsDemo{
    // Главный метод:
    public static void main(String[] args){
// Создание объекта на основе обобщенного класса:
        Bravo<Integer,Character> A=new Bravo<Integer,Character>(100,'A');
// Отображение значений полей объекта:
        A.show();
// Создание объекта на основе обобщенного класса:
        Bravo<String,Double> B=new Bravo<>("BRAVO",12.345);
// Отображение значений полей объекта:
        B.show();
    }
}