package ProgUA.Java02OOP.classWork.lesson05.SuperAndSubDemo;

class Alpha{ // Суперкласс
    String name; // Текстовое поле
    void show(){ // Метод для отображения значения поля
        String txt="Объект класса Alpha\n"; // Локальная текстовая переменная
        txt+="Поле name: "+name+"\n";
        for(int k=1;k<=20;k++){
            txt+="-";
        } // Отображение сообщения:
        System.out.println(txt);
    }
}