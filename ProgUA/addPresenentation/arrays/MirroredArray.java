package ProgUA.addPresenentation.arrays;

import ProgUA.ArrClass;
/*10. Написать метод, который заполнит массив
произвольного размера числами по возрастанию,
начиная с центра массива, например,
[5,4,3,2,1,0,1,2,3,4,5].*/

public class MirroredArray {
    public static void main(String[] args) {
        int num=13;
        int [] arr = new int[num];

        switch (arr.length%2){
            case 0:
                for (int i=0; i<arr.length/2; i++){
                    arr[arr.length/2+i]=i;
                    arr[arr.length/2-i-1]=i;
                }
                break;
            case 1:
                for (int i=0; i<arr.length/2+1; i++){
                    arr[arr.length/2+i]=i;
                    arr[arr.length/2-i]=i;
                }
                break;
        }
        ArrClass.printArr(arr);
    }
}
