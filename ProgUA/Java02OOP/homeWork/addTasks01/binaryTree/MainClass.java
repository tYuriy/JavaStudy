package ProgUA.Java02OOP.homeWork.addTasks01.binaryTree;

import java.util.ArrayList;

/*
* 9. Напишите программу, в которой создается "бинарное дерево" объектов:
каждый объект ссылается на два других объекта. Предложить алгоритм создания
такого "дерева", методы для идентификации объектов в нем и способы перебора
объектов в "дереве".*/
public class MainClass {
    public static void main(String[] args) {
        int k = 0;
        int currentDeep=3;
        //Создание и заполнение массива объектов со значениями для формирования бинарного дерева.
        ArrayList<BinElem> binArr = new ArrayList<>();
        for (int i = 0; i < Math.pow(2,currentDeep)-1; i++) {
            //вычисление параметра, кот. отвечает за уровень (глубину) объекта в бинарном дереве
            if (BinElem.getCnt()>=Math.pow(2,BinElem.getDeepStep())) {
                BinElem.setDeepStep(BinElem.getDeepStep()+1);
            }
            //добавление нового объекта в массив
            binArr.add(new BinElem());
        }
        //вывод всех созданных объектов
        for (BinElem x:binArr) {
            System.out.println(x.toString());
        }

        System.out.println("\nФормирование бинарного дерева:");
        int j;//переменная, для обозначения индекса родительского объекта
        int curCnt=1;//счетчик количества операция присваивания, для выявления объкта, который нужно присвоить следующим
        BinElem mainElem;//обозначение родительского объекта
        BinElem subElem;//обозначение дочернего объекта
        for (int i = 0; i < binArr.size(); i++) {
            j=i;
            mainElem = binArr.get(j);
            //присваивание 1-го дочернего объекта
            if (mainElem.getLink1()==null & i+1<binArr.size() & mainElem.getStep()<currentDeep){
                subElem = binArr.get(curCnt);
                if (mainElem.getStep()<subElem.getStep()){
                    mainElem.setLink1(subElem);
                }
                i++;
                curCnt++;
            }
            //присваивание 2-го дочернего объекта
            if (mainElem.getLink2()==null & i+1<binArr.size() & mainElem.getStep()<currentDeep){
                subElem = binArr.get(curCnt);
                if (mainElem.getStep()<subElem.getStep()){
                    mainElem.setLink2(subElem);
                }
                curCnt++;
                i++;
            }
            i=j;
       }

        for (BinElem x:binArr) {
            System.out.println(x.toString());
        }
        System.out.println("\nПоиск объектов по уровню в дереве:");
        selectObjByDeepLvl(binArr, 2);

        System.out.println("\nПоиск объектов по номеру:");
        selectObjByNumber(binArr, 7);

    }
    public static void selectObjByDeepLvl (ArrayList<BinElem> al, int x){
        int cnt=0;
        for (BinElem s:al) {
            if (s.getStep()==x) {System.out.println(s.toString());
            cnt++;
            }
        }
        System.out.println(cnt==0?"Ничего не найдено":"");
    }
    public static void selectObjByNumber (ArrayList<BinElem> al, int x){
        int cnt=0;
        for (BinElem s:al) {
            if (s.getObjNum()==x) {System.out.println(s.toString());        cnt++;}
        }
        System.out.println(cnt==0?"Ничего не найдено":"");
    }
}
