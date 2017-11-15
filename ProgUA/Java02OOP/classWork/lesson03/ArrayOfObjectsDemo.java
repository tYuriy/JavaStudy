package ProgUA.Java02OOP.classWork.lesson03;

// Класс с целочисленным полем:
class MyClass{
    // Закрытое целочисленное поле:
    private int number;
    // Конструктор:
    MyClass(int n){
        number=n;
    }
    // Метод для считывания значения поля:
    int get(){
        return number;
    }
}
// Продолжение на следующем слайде!!!
// Главный класс:
class ArrayOfObjectsDemo{
    // Статический метод для создания массива объектов:
    static MyClass[] createBinoms(int n){
// Создается массив из объектных переменных:
        MyClass[] bins=new MyClass[n+1];
// Создание объекта, ссылка на который записывается
// в начальный элемент массива:
        bins[0]=new MyClass(1);
// Создание объектов и заполнение массива:
        for(int k=1;k<=n;k++){
// Создается новый объект и ссылка на него
// присваивается значением элементу массива:
            bins[k]=new MyClass(bins[k-1].get()*(n-k+1)/k);
        }
// Результат метода:
        return bins;
    }
    // Продолжение на следующем слайде!!!
// Статический метод для отображения значений полей
// объектов, формирующих массив:
    static void show(MyClass[] objs){
// Начальное значение текстовой переменной:
        String txt="| ";
// В текст дописываются значения полей объектов,
// которые формируют массив, переданный
// аргументом методу:
        for(int k=0;k<objs.length;k++){
            txt+=objs[k].get()+" | ";
        }
        System.out.println(txt);
    }
    // Главный метод программы:
    public static void main(String[] args){
// Создание массивов из объектов:
        MyClass[] A=createBinoms(5);
        MyClass[] B=createBinoms(10);
// Отображение значений полей объектов из массивов:
        show(A);
        show(B);
    }
}
