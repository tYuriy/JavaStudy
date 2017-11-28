package ProgUA.Java02OOP.classWork.presentation05.NestedTryCatchDemo;

// Импорт классов:
import java.util.*;
// Главный класс:
class NestedTryCatchDemo{
    // Главный метод:
    public static void main(String[] args){
// Объект класса Scanner (нужен для реализации
// консольного ввода):
        Scanner input=new Scanner(System.in);
// Переменная массива:
        char[] symbs;
// Переменные для записи размера массива
// и индекса элемента:
        int size,index;
// Продолжение на следующем сайте!!!
// Контролируемый код (внешний блок):
        try{
// Отображение сообщения:
            System.out.print("Укажите размер массива: ");
// Считывание размера массива:
            size=input.nextInt();
// Создание массива:
            symbs=new char[size];
            System.out.print("| ");
// Заполнение массива символами:
            for(int k=0;k<size;k++){
// Элементу массива присваивается значение:
                symbs[k]=(char)('A'+k);
// Отображается значение элемента:
                System.out.print(symbs[k]+" | ");
            }
// Контролируемый код (внутренний блок):
            try{
                System.out.print("\nУкажите индекс: ");
// Считывание значения индекса:
                index=input.nextInt();
// Значение элемента:
                System.out.println("Символ - "+symbs[index]);
            }
// Продолжение на следующем слайде!!!
// Если пользователь ввел некорректный индекс:
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Такого элемента нет");
            }
// Блок выполняется всегда:
            finally{
                System.out.println("Массив создан успешно");
            }
            System.out.println("Для индекса указано числовое значение");
        }
// Если введено не число:
        catch(InputMismatchException e){
            System.out.println("Ошибка: вы не ввели число");
        }
// Если для массива указан отрицательный размер:
        catch(NegativeArraySizeException e){
            System.out.println("Неверный размер массива");
        }
        System.out.println("Выполнение программы завершено");
    }
}