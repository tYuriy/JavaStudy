package Java01Start.classWork.lesson8;

class MyClass3{
    // Закрытые поля:
    private int num;
    private char symb;
    // Открытые методы:
    void set(int n,char s){ // Первая версия метода
        num=n;
        symb=s;
    }
    void set(int n){ // Вторая версия метода
        num=n;
        symb='B';
    }
    void set(){ // Третья версия метода
        set(0,'A');
    }
    void show(){
        System.out.println("Поля: "+num+" и "+symb);
    }
}
public class MethodsDemo {
    public static void main(String[] args){
        MyClass3 obj=new MyClass3(); // Создание объекта
// Вызов методов:
        obj.set();
        obj.show();
        obj.set(100);
        obj.show();
        obj.set(200,'C');
        obj.show();
    }
}
