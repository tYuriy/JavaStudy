package ProgUA.Java02OOP.homeWork.lesson02.TwoClassesProgram;

class ClassChar {
    ClassChar(){
        this.symb = 'A';
    }
    ClassChar(char symb){
        this.symb = symb;
    }
    private char symb;
    public void setSymb (char symb){
        this.symb = symb;
    }
    public char getSymb (){
        return symb;
    }
    public void setSymbByNum(ClassInt ci){
        this.symb = (char) ci.getNum();
    }
}