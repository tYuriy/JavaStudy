package ProgUA.Java02OOP.classWork.pres06lambda.demo02MoreAnonymousClassDemo;

// Главный класс:
class MoreAnonymousClassDemo{
    public static void main(String[] args){
// Создание объекта анонимного класса:
        Base obj=new Base(){
            // Описание метода из интерфейса:
            public void hello(){
                System.out.println("Объект анонимного класса");
            }
        }; // Завершение инструкции создания объекта
// анонимного класса
// Вызов методов из объекта, созданного на основе
// анонимного класса:
        obj.show();
        obj.hello();
// Продолжение на следующем слайде!!!
// Создание анонимного объекта анонимного класса
// и вызов их этого объекта метода showAll(),
// описанного в анонимном классе:
        new Base(){
            // Описание метода из интерфейса:
            public void hello(){
                System.out.println("Анонимный объект");
            }
            // Описание нового метода:
            void showAll(){
                hello();
                show();
            }
        }.showAll(); // Вызов метода
    }
}