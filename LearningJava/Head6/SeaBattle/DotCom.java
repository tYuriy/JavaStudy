package LearningJava.Head6.SeaBattle;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2017.
 */
public class DotCom {
    //переменные экземпляра класса ДотКом
    private ArrayList<String> locationCells;//местоположение сайта
    private String name;//имя сайта
    //сеттер, кот. обновляем местоположение сайта (метод плейсДотКом, класс ГеймХелпер)
    public void setLocationCells (ArrayList<String>loc){
        locationCells = loc;
    }
    public void setName (String n){//простой сеттер
        name = n;
    }
    public String getName (){
        return name;
    }
    public String checkYourself (String userInput){
        String result = "Miss";
        //метод индексОф() из АррайЛисе в действии.
        //Если ход пользователя совпал с одним из элементов АррайЛист, то метод вернет его
        //местроположение, иначе вернет -1
        int index = locationCells.indexOf(userInput);
        if (index>=0){
            locationCells.remove(index);//применяем метод для удаления элемента
            if (locationCells.isEmpty()){//проверка, все ли адреса были разгаданы
                result = "Total down!!!";
                //сообщаем пользователю о потоплении
                System.out.println("You defeated " + name);
            } else {
                result = "Got it!";
            }
        }
        return result;//возвращаем результат(мимо, попал, потопил)
    }
}
