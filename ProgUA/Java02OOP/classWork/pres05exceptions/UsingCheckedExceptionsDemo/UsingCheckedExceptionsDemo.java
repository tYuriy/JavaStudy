package ProgUA.Java02OOP.classWork.pres05exceptions.UsingCheckedExceptionsDemo;

class UsingCheckedExceptionsDemo{
    // Метод выбрасывает контролируемое исключение:
    static void alpha(int n) throws Exception{
// Текст для передачи аргументом конструктору
// при создании объекта исключения:
        String txt="Метод alpha() с аргументом "+n;
// Генерирование исключения:
        throw new Exception(txt);
    }
    // Метод выбрасывает неконтролируемое исключение:
    static void bravo(int n){
// Текст для передачи аргументом конструктору
// при создании объекта исключения:
        String txt="Метод bravo() с аргументом "+n;
// Контролируемый код:
        try{
            if(n>0){
// Генерирование контролируемого исключения:
                throw new Exception(txt);
            }
            else{
// Генерирование неконтролируемого исключения:
                throw new RuntimeException(txt);
            }
        }
// Продолжение на следующем слайде!!!
// Обработка неконтролируемого исключения:
        catch(RuntimeException e){
// Повторное генерирование неконтролируемого
// исключения:
            throw e;
        } // Обработка контролируемого исключения:
        catch(Exception e){
            System.out.println("Обработка ошибки в bravo():");
            System.out.println(e.getMessage());
            System.out.println("***************************");
        }
    } // Метод для вызова при обработке исключений.
    // Аргументом методу передается объект исключения:
    static void catchMe(Exception e){
        System.out.println("Обработка ошибки в main():");
        System.out.println(e.getMessage());
        System.out.println("--------------------------");
    } // Главный метод:
    public static void main(String[] args){
// Контролируемый код:
        try{
// При вызове метода выбрасывается
// контролируемое исключение класса Exception:
            alpha(123);
        }
// Продолжение на следующем слайде!!!
// Обработка исключения:
        catch(Exception e){
// Вызов метода для обработки исключения:
            catchMe(e);
        } // Контролируемый код:
        try{
// При вызове метода не выбрасывается
// исключение:
            bravo(123);
        } // Обработка исключения (блок не используется,
// поскольку исключение не генерируется):
        catch(Exception e){
// Вызов метода для обработки исключения:
            catchMe(e);
        } // Контролируемый код:
        try{
// При вызове метода выбрасывается неконтролируемое исключение
// класса RuntimeException:
            bravo(-1);
        } // Обработка исключения:
        catch(Exception e){
// Вызов метода для обработки исключения:
            catchMe(e);
        }
    }
}