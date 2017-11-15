package Java01Start.classWork.lesson8;

class MyClass4{
    int num;
    char symb;
    void show(){
        System.out.println("Поля: "+num+" и "+symb);
    }
    // Конструкторы:
    MyClass4(){
        num=100;
        symb='A';
    }
    MyClass4(int n){
        num=n;
        symb='B';
    }
    MyClass4(int n,char s){
        num=n;
        symb=s;
    }
}
public class ConstructorsDemo {
    public static void main(String[] args){
// Создание объектов:
        MyClass4 A=new MyClass4();
        MyClass4 B=new MyClass4(200);
        MyClass4 C=new MyClass4(300,'C');
// Проверка значений полей:
        A.show();
        B.show();
        C.show();
    }
}
