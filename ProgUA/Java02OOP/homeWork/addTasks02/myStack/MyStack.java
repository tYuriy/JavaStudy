package ProgUA.Java02OOP.homeWork.addTasks02.myStack;

public class MyStack<X> {
    private MyClass<X> pointer;
    MyStack(){
        pointer=null;
    }
    public void put (MyClass<X> mc){
        pointer = new MyClass<>();
    }
}
