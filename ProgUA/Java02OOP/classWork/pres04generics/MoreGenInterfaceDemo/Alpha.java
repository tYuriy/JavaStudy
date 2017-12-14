package ProgUA.Java02OOP.classWork.pres04generics.MoreGenInterfaceDemo;

// Создание первого класса на основе
// обобщенного интерфейса:
class Alpha implements MyMethods<Integer>{
    // Закрытое поле целочисленного типа:
    private Integer value;
    // Описание методов из интерфейса:
    public Integer get(){
        return value;
    }
    public void set(Integer arg){
        value=arg;
    }
    // Метод для отображения значения поля:
    void show(){
        System.out.println("Целочисленное поле: "+get());
    }
    // Конструктор:
    Alpha(Integer arg){
        value=arg;
    }
} // Продолжение на следующем слайде!!!
