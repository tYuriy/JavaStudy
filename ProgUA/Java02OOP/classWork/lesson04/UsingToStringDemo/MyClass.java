package ProgUA.Java02OOP.classWork.lesson04.UsingToStringDemo;

class MyClass{ // Пользовательский класс
    String name; // Текстовое поле
    int code; // Целочисленное поле
    MyClass(String txt,int num){ // Конструктор
        name=txt;
        code=num;
    }
    // Переопределение метода toString():
    public String toString(){
        String txt="Объект класса MyClass\n"; // Локальная текстовая переменная
        txt+="Поле name: "+name+"\n";
        txt+="Поле code: "+code+"\n";
// Импровизированная "линия":
        for(int k=1;k<=21;k++){
            txt+="-";
        }
        return txt; // Результат метода
    }
}