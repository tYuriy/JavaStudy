package ProgUA.Java02OOP.homeWork.lesson02.ClassByMethod;

class CharClass {
    CharClass (){
        this.symb = 'a';
    }
    CharClass (char symb){
        this.symb = symb;
    }
    private char symb;

    public char getSymb() {
        return symb;
    }

    public void setSymb(char symb) {
        this.symb = symb;
    }
}