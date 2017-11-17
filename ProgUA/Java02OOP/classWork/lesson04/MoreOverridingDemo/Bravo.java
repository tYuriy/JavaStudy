package ProgUA.Java02OOP.classWork.lesson04.MoreOverridingDemo;

class Bravo extends Alpha{
    int code;
    void show(){
        super.show(); // Вызов версии метода из суперкласса
        System.out.println("Числовое поле "+code);
    }
    Bravo(String name,int code){
        super(name); // Вызов конструктора суперкласса
        this.code=code;
    }
}