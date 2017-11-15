package ProgUA.Java02OOP.classWork.lesson05.UsingPrivatesDemo;

// Суперкласс:
class Alpha{
    // Закрытое поле:
    private int code;
    // Открытый метод для присваивания значения
// закрытому полю:
    public void set(int code){
        this.code=code;
    }
    // Открытый метод для отображения значения
// закрытого поля:
    public void show(){
        System.out.println("Поле code: "+code);
    }
    // Конструктор класса:
    Alpha(int code){
        set(code);
    }
}