package ProgUA.Java02OOP.classWork.lesson06.UsingDefaultMethodsDemo;

class Alpha implements Base{
    // Описание обычного метода:
    public void hello(){
        System.out.println("Объект класса Alpha");
    }
    // Описание метода с кодом по умолчанию:
    public void show(String txt){
        System.out.println("Класс Alpha: "+txt);
    }
} // Продолжение на следующем слайде!!! default
