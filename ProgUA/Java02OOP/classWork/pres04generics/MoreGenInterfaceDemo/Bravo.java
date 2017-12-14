package ProgUA.Java02OOP.classWork.pres04generics.MoreGenInterfaceDemo;

// Создание второго класса на основе
// обобщенного интерфейса:
class Bravo implements MyMethods<Character>{
    // Закрытое поле символьного типа:
    private Character value;
    // Описание методов из интерфейса:
    public Character get(){
        return value;
    }
    public void set(Character arg){
        value=arg;
    }
    // Метод для отображения значения поля:
    void show(){
        System.out.println("Символьное поле: "+get());
    }
    // Конструктор:
    Bravo(Character arg){
        value=arg;
    }
}
