package ProgUA.Java02OOP.classWork.pres04generics.GenTypeExtendingDemo;

// Подкласс суперкласса Alpha:
class Bravo extends Alpha{
    // Символьное поле:
    char symbol;
    // Конструктор:
    Bravo(String txt,int n,char s){
// Вызов конструктора суперкласса:
        super(txt,n);
// Присваивание значения символьному полю:
        symbol=s;
    }
    // Переопределение метода:
    void show(){
// Вызов версии метода из суперкласса:
        super.show();
// Отображение значения символьного поля:
        System.out.println("Символьное поле: "+symbol);
    }
}
