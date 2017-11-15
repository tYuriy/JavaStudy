package ProgUA.Java02OOP.homeWork.lesson02.SwapArgs;

class SomeClass {
    SomeClass (char a, int b){
        this.aSymb = a;
        this.num = b;
    }
    SomeClass (){
        this.aSymb = 'a';
        this.num = 0;
    }
    private char aSymb;
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setaSymb(char aSymb) {
        this.aSymb = aSymb;
    }

    public char getaSymb() {
        return aSymb;
    }

    void swapArgs (SomeClass sc){
        this.aSymb=sc.aSymb;
        this.num = sc.num;
        sc.aSymb++;
        sc.num++;
    }
    void show (){
        System.out.println(aSymb + " & " + num);
    }
}