package ProgUA.Java02OOP.classWork.lesson06.UsingInterfaceVarsDemo;

// Класс реализует интерфейс Base:
class Alpha implements Base{
    // Текстовое поле:
    String word;
    // Конструктор:
    Alpha(String txt){
        word=txt;
    }
    // Описание метода из интерфейса:
    public void show(){
        System.out.println("Объект класса Alpha");
        System.out.println("Текстовое поле: "+word);
    }
} // Продолжение на следующем слайде!!!
