package ProgUA.Java02OOP.homeWork.addTasks01.binaryTree;

public class BinElem {
    private static char name = 'A';
    private static int cnt=1;
    private static int deepStep=1;
    private char objName;
    private int objNum;
    private int step;
    private BinElem link1;
    private BinElem link2;
    BinElem (){
        this.objName = name++;
        this.objNum = cnt++;
        this.step = deepStep;
    }
//    BinElem (char name, int cnt, int deepStep){
//        this.objName = name++;
//        this.objNum = cnt++;
//        this.step = deepStep;
//    }
//    BinElem (BinElem binEl){
//        this.objName = name++;
//        this.objNum = cnt++;
//        this.step = deepStep;
//        link1 = new BinElem(name++, cnt++, deepStep);
//        link2 = new BinElem(name++, cnt++, deepStep);
//    }

    public BinElem getLink1() {
        return link1;
    }

    public BinElem getLink2() {
        return link2;
    }

    public void setLink1(BinElem link1) {
        this.link1 = link1;
    }

    public void setLink2(BinElem link2) {
        this.link2 = link2;
    }

    public char getObjName() {
        return objName;
    }

    public void setObjName(char objName) {
        this.objName = objName;
    }

    public int getObjNum() {
        return objNum;
    }

    public void setObjNum(int objNum) {
        this.objNum = objNum;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public static char getName() {
        return name;
    }

    public static void setName(char name) {
        BinElem.name = name;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        BinElem.cnt = cnt;
    }

    public static int getDeepStep() {
        return deepStep;
    }

    public static void setDeepStep(int deepStep) {
        BinElem.deepStep = deepStep;
    }

    @Override
    public String toString() {
        try {
            return "Имя объекта: " + this.objName + ". Номер объекта: " + this.objNum + ". Уровень в бинароном дереве: " + this.step + " Ссылается на объекты: " + this.link1.objName + " и " + this.getLink2().objName;
        } catch (NullPointerException ex) {
            return "Имя объекта: " + this.objName + ". Номер объекта: " + this.objNum + ". Уровень в бинароном дереве: " + this.step + " На другие объекты не ссылается.";
        }

    }
}
