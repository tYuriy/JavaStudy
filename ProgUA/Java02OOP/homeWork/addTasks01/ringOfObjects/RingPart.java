package ProgUA.Java02OOP.homeWork.addTasks01.ringOfObjects;

import java.util.Random;

public class RingPart {
    RingPart rpLink;
    private int num;
    private char sym;
    private static char name='A';
    private char aName;
    RingPart(){
        Random rnd = new Random();
        num = rnd.nextInt(100);
        sym = (char) rnd.nextInt(200);
        aName=name++;
    }
    //метод для вывода объектов в консоль
    public void printRing (int x){
        int k=0;
        RingPart rpTemp=this;

        do {
            System.out.println(rpTemp.toString());
            rpTemp = rpTemp.rpLink;
            k++;
        }while (k<x);
    }
    //метод для добавления элемента в кольцо объектов
    public void addItem (RingPart rpTemp){
        this.rpLink = rpTemp.rpLink;
        rpTemp.rpLink = this;
        //this.rpLink = rpStart;
    }
    //метод для удаления элемента из кольца
    public void delItem (char c){
        if (c>name | c<'A') {
            System.out.println("Нет элемента с полем '" + c + "', кольцо объектов осталось без изменений!");
            return;
        }
        RingPart rpTemp = this.rpLink;
        RingPart rpPrev = this;
        do {
            rpPrev = rpTemp;
            //System.out.println("rpPrev " + rpPrev.toString());
            rpTemp = rpTemp.rpLink;
            //System.out.println("rpTemp " + rpTemp.toString());

            //rpPrev.rpLink = rpTemp;
        } while (rpTemp.aName !=c);

        rpPrev.rpLink = rpTemp.rpLink;
    }
    @Override
    public String toString() {
        return "Object: " + this.aName +" int field: "+ this.num + " char field: "+ this.sym+ " references to object: " + this.rpLink.aName ;
    }
    public char getSym() {
        return sym;
    }
    public int getNum() {
        return num;
    }

    public char getaName() {
        return aName;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void setSym(char sym) {
        this.sym = sym;
    }

    public void setaName(char aName) {
        this.aName = aName;
    }
}
