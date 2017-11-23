package LearningJava.Head6.SeaBattle;


import java.util.ArrayList;

/**
 * Created by user on 14.03.2017.
 */
public class DotComBust {
    //объявляем и инициализируем переменные, которые нам нужны.
    private GameHelper helper = new GameHelper();
    //создаем АррайЛист только для объектов ДотКомы
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses=0;

    private void setUpGame(){
        //Create some "sites" and give them addresses;
        //Создаем три объекта, даем им имена и помещаем в ArrayList.
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three = new DotCom();
        one.setName("Pets.com");
        two.setName("eToys.com");
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        //Выводим инструкции для пользователя.
        System.out.println("Your target - defeat three \"sites\".");
        System.out.println(one.getName() + ", " + two.getName() + ", " + three.getName());
        System.out.println("Try to go it for minimal moves.");

        for (DotCom dotComToSet : dotComList){//повторяем с каждым объектом в списке
            //запрашиваем у вспомагательного объекта адрес сайта
            ArrayList<String> newLocation = helper.placeDotCom(3);
            //вызываем сеттер из ДотКом и передаем ему местоположение,
            // кот получили от вспомагательного объекта
            dotComToSet.setLocationCells(newLocation);
        }//Конец цикла
    }//Конец метода setUpGame
    private void startPlaying(){
        while (!dotComList.isEmpty()){ //до тех пор пока список объектов не станет пустым
            String userGuess = helper.getUserInput("Do your move.");
            checkUserGuess(userGuess);//вызываем наш метод checkUserGuess
        } // Конец while
        finishGame();
    } // Конец метода startPlaying
    private void checkUserGuess(String userGuess){
        numOfGuesses++;//инекремент попыток, кот сделал пользователь
        String result = "Miss";//подразумеваем промах, пока не выяснили обратного

        for (DotCom dotComToTest : dotComList){//повторяем для всех объектов в цикле
            result=dotComToTest.checkYourself(userGuess);//просим ДотКом проверить игру, ищем попадание или потопление
            if (result.equals("Got it!")){
                break;//выбираемся из цикла раньше времени, нет смысла проверять дальшеы
            }
            if (result.equals("Total down!!!")){
                dotComList.remove(dotComToTest);//ему пришел конец, удаляем из списка сайтов
                break;
            }
        }
        System.out.println(result);//выводим для пользователя результат
    }
    private void finishGame(){
        //выводим для пользователя результат
        System.out.println("All sities go down");
        if (numOfGuesses <=18){
            System.out.println("You end with " + numOfGuesses + " tries!");
        } else {
            System.out.println("You waste too much time. " + numOfGuesses + " tries.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();//создаем игровой объект
        game.setUpGame();//говорим игровому объекту подготовить игру
        game.startPlaying();//говорим игровому объекту начать главный игровой цикл
    }
}
