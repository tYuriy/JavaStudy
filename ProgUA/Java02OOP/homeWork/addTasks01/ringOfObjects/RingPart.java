package ProgUA.Java02OOP.homeWork.addTasks01.ringOfObjects;

import java.util.Random;

public class RingPart {
    RingPart rp;
    private int num;
    private char sym;
    RingPart(){
        Random rnd = new Random();
        num = rnd.nextInt(10000);
        sym = (char) rnd.nextInt(400);
    }
    @Override
    public String toString() {

        return this.getClass() +" "+ this.num + " "+ this.sym + " " + this.rp.toString();
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
