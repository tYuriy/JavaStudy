package Java01Start.classWork.lesson7;

public class OverloadMethDemo {
    static void show(String txt){ // Метод для отображения текста
        System.out.println("Текст: "+txt);
    }
    static void show(int num){ // Метод для отображения целого числа
        System.out.println("Целое число: "+num);
    }
    // Метод для отображения действительного числа:
    static void show(double num){
        System.out.println("Действительное число: "+num);
    }
    static void show(char s){ // Метод для отображения символа
        System.out.println("Символ: "+s);
    }
    static void show(int num,char s){// Метод для отображения числа и символа
        System.out.println("Aргументы "+num+" и "+s);
    }
    // Главный метод:
    public static void main(String[] args){
// Переменные:
        int num=5;
        char symb='R';
        double z=3;
// Вызываем метод:
        show(symb);
        show("Язык программирования Java");
        show(num);
        show(z);
        show(num,'W');
    }
}
