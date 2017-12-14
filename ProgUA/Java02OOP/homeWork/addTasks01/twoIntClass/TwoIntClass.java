package ProgUA.Java02OOP.homeWork.addTasks01.twoIntClass;



public class TwoIntClass {
    private int a;
    private int b;
    TwoIntClass (){
        this.a = 1;
        this.b = 2;
    }
    TwoIntClass(int a, int b){
        this.a = a;
        this.b = b;
    }
    public TwoIntClass objCreate (TwoIntClass tic){
        tic = new TwoIntClass(tic.a + this.a, tic.b + this.b);
        return tic;
    }

    @Override
    public String toString (){
        String str;
        str = "object parameters: \nfirst int = " + this.getA()
                                +"\nsecond int = " + this.getB() + "\n";
    return str;
}

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}
