package ProgUA.Java02OOP.classWork.pres06lambda.demo13LambdaAsFieldDemo;

// Главный класс:
class LambdaAsFieldDemo{
    // Главный метод:
    public static void main(String[] args){

// Проверка результата:
        System.out.println("Аргумент:");
        for(int k=0;k<=5;k++){
            System.out.print(k+"\t");
        }

// Создание объекта класса с передачей аргументом
// конструктору лямбда-выражения:
        MyClass obj=new MyClass((int n)->{return n*n;});

        System.out.println("\nАргумент в квадрате:");
        for(int k=0;k<=5;k++){
            System.out.print(obj.get(k)+"\t");
        }
// Полю объекта присваивается новое значение:
        obj.set((int n)->{return n*n*n;});
// Проверка результата:
        System.out.println("\nАргумент в кубе:");
        for(int k=0;k<=5;k++){
            System.out.print(obj.get(k)+"\t");
        }
        System.out.println("");
    }
}