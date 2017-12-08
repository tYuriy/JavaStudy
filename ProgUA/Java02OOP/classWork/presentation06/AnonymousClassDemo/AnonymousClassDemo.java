package ProgUA.Java02OOP.classWork.presentation06.AnonymousClassDemo;

class AnonymousClassDemo{
    public static void main(String[] args){
// Создание объекта анонимного класса:
        Base obj=new Base("Красный"){
            // Описание абстрактного метода из суперкласса:
            @Override
            void hello(){
                System.out.println("Объект анонимного класса");
            }
        }; // Завершение инструкции создания объекта анонимного класса
// Продолжение на следующем слайде!!!


// Вызов методов из объекта, созданного на основе
// анонимного класса:
        obj.show();
        obj.hello();
// Создание анонимного объекта анонимного класса
// и вызов их этого объекта метода showAll(),
// описанного в анонимном классе:
        new Base("Зеленый"){
            // Описание абстрактного метода из суперкласса:
            void hello(){
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