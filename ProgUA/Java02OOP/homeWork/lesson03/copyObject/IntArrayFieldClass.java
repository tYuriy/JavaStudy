package ProgUA.Java02OOP.homeWork.lesson03.copyObject;

public class IntArrayFieldClass {

    private int [] intArr = {3,4,1,5};

    public void setIntArr(int[] intArr) {
        this.intArr = intArr;
    }

    public int[] getIntArr() {
        return intArr;
    }

    public static IntArrayFieldClass copyObj (int [] arr) {
        return new IntArrayFieldClass();
    }

    public static int [] copyObj (IntArrayFieldClass iafc) {
        int newArrCopy [] = iafc.intArr;
        return newArrCopy;
    }
}
