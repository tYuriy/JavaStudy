package ProgUA.Java02OOP.homeWork.lesson02.TwoClassesProgram;

class ClassInt {
    ClassInt(){
        this.num =0;
    }
    ClassInt(int num){
        this.num =num;
    }
    private int num;
    public void setNum (int num){
        this.num = num;
    }
    public int getNum (){
        return num;
    }
    public void setNumBySymb (ClassChar cc){
        this.num = (int)cc.getSymb();
    }
}