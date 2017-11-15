package ProgUA.Java02OOP.homeWork.lesson02.NewIntClass;

class IntFieldClass {
    IntFieldClass(){
        this.num = 0;
    }
    IntFieldClass (int num){
        this.num = num;
    }
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public IntFieldClass copyObject(){
        return this;
    }
    public IntFieldClass copyObject(int num){
        IntFieldClass ifc = new IntFieldClass();
        ifc.num=this.num;
        this.num=num;
        return ifc;
    }

    public void show (IntFieldClass ifc) {
        System.out.println("Значение полей созданных объектов:");
        System.out.println("объект первый: " + this.num);
        System.out.println("объект второй: " + ifc.num);
        System.out.println();
    }
}
