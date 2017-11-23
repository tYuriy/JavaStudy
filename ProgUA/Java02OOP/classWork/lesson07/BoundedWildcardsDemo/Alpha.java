package ProgUA.Java02OOP.classWork.lesson07.BoundedWildcardsDemo;

// Первый класс:
class Alpha{
    // Закрытое текстовое поле:
    private String name;
    // Конструктор:
    Alpha(String txt){
        name=txt;
    }
    // Переопределение метода toString():
    public String toString(){
        return name;
    }
} // Второй класс:
