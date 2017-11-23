package ProgUA.Java02OOP.classWork.lesson06.UsingGenericsDemo;

// Обобщенный класс с двумя параметрами:
class Bravo<X,Y>{
    Alpha<X> obj; // Поле - объект обобщенного класса
    Y second; // Поле обобщенного типа
    Bravo(X first,Y second){// Конструктор с двумя аргументами обобщенного типа
        obj=new Alpha<X>(first);// Создание объекта на основе обобщенного класса
        this.second=second; // Присваивание значения полю
    } // Метод для отображения значений полей:
    void show(){
        System.out.println("Значения "+obj.get()+" и "+second);
    }
}
