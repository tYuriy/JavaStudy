package ProgUA.Java02OOP.classWork.lesson07.GenInterfaceDemo;

class MyClass<X> implements MyMethods<X>{
    private X value; // Закрытое поле обобщенного типа
    public X get(){ // Описание методов из интерфейса
        return value;
    }
    public void set(X arg){
        value=arg;
    } // Метод для отображения значения поля:
    void show(){
        System.out.println("Значение поля: "+get());
    } // Конструктор:
    MyClass(X arg){
        value=arg;
    }} // Продолжение на следующем слайде!!!
