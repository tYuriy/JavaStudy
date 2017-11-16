package ProgUA.Java02OOP.homeWork.lesson03.copyObject;

public class IntArrayFieldClass {
    int [] intArr = {3,4,1,5};
    static IntArrayFieldClass copyObj (int [] arr) {
        return new IntArrayFieldClass();
    }
    static int [] copyObj (IntArrayFieldClass iafc) {
        int newArrCopy [] = iafc.intArr;
        return newArrCopy;
    }
}
