package ProgUA.Java02OOP.homeWork.lesson03.chainOfObjects;

public class ObjClass {
    private int num;
    private ObjClass oc;
    ObjClass(int num){
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public ObjClass getOc() {
        return oc;
    }
    public void setOc(ObjClass oc) {
        this.oc = oc;
    }
}
