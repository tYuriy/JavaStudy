package ProgUA.Java02OOP.homeWork.addTasks01.ringOfObjects;

import java.util.Random;

public class RingPart {
    RingPart rp;
    private int num;
    private char sym;
    RingPart(){
        Random rnd = new Random();
        num = rnd.nextInt();
        sym = (char) rnd.nextInt();
    }
    @Override
    public String toString() {

        return super.toString() +" "+ this.num + " "+ this.sym + " " + this.rp;
    }

    public char getSym() {
        return sym;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSym(char sym) {
        this.sym = sym;
    }
}
