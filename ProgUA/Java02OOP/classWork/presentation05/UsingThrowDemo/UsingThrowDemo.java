package ProgUA.Java02OOP.classWork.presentation05.UsingThrowDemo;

class UsingThrowDemo{
    public static void main(String[] args){ // Создание объекта исключения:
        Exception me=new Exception("Искусственная ошибка");
        try{ // Контролируемый код (внешний блок)
            System.out.println("Генерируется ошибка");
            try{ // Контролируемый код (внутренний блок)
                throw me; // Генерирование исключения
            } // Обработка исключения (внутренний блок):
            catch(Exception one){
                System.out.println(one);
                System.out.println("А теперь еще одна ошибка");
                throw one; // Повторное генерирование исключения
            }
        } // Обработка исключения (внешний блок):
        catch(Exception two){
            System.out.println(two);
        }
        System.out.println("Выполнение программы завершено");
    }
}
