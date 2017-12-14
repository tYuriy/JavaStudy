package ProgUA.Java02OOP.classWork.pres06lambda.demo06ObjMethReferenceDemo;

// Продолжение на следующем слайде!!!
class ObjMethReferenceDemo{ // Главный класс
    public static void main(String[] args){ // Главный метод
        MyClass obj=new MyClass(100); // Создание объекта
        System.out.println("Создан объект с полем 100");
        MyGetter A=obj::get; // Используем ссылки на методы
        MySetter B=obj::set;
// Проверяем "значение поля" вызовом метода myget()
// из интерфейсной переменной A:
        System.out.println("Переменная A: "+A.myget());
// Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
// Полю объекта присваивается значение:
        obj.set(200);
        System.out.println("Полю присвоено значение 200");
// Проверяем "значение поля" вызовом метода myget()
// из интерфейсной переменной A:
        System.out.println("Переменная A: "+A.myget());
// Присваиваем "значение полю" вызовом метода myset()
// из интерфейсной переменной B:
        B.myset(300);
        System.out.println("Выполнена команда B.myset(300)");
// Проверяем "значение поля" вызовом метода myget()
// из интерфейсной переменной A:
        System.out.println("Переменная A: "+A.myget());
// Продолжение на следующем слайде!!!
// Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
// Создается новый объект:
        obj=new MyClass(400);
        System.out.println("Создан объект с полем 400");
// Проверяем "значение поля" вызовом метода myget()
// из интерфейсной переменной A:
        System.out.println("Переменная A: "+A.myget());
// Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
// Присваиваем "значение полю" вызовом метода myset()
// из интерфейсной переменной B:
        B.myset(500);
        System.out.println("Выполнена команда B.myset(500)");
// Проверяем "значение поля" вызовом метода myget()
// из интерфейсной переменной A:
        System.out.println("Переменная A: "+A.myget());
// Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
    }
}