package ProgUA.Java01Start.classWork.addInfo.arrays;

import ProgUA.ArrClass;

public class ArrExersize3 {
    /*
    7. Найти в массиве число, которое повторяется
наибольшее количество раз. Не использовать
коллекции.
     */
    public static void main(String[] args) {
        //ArrClass ac = new ArrClass();
        int a = 0;//переменная для подсчета текущего кол-ва элементов
        int aFact = 0;//переменная для подсчета наибольшего (на данный момент) кол-ва элементов
        int b = 0;//переменная для указания текущего элемента
        int bFact = 0;//переменная для указания элемента с наибольших кол-вом повторов
        int [] arr = ArrClass.fillArray(10,5);
        ArrClass.printArr(arr);
        for (int i = 0; i<arr.length; i++){
            a=0;
            b=0;
            for (int j = 0; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    a++;
                    b=arr[i];
                }
            }
            if (a>aFact){
                aFact=a;
                bFact = b;
            }
        }
        System.out.println(aFact);
        System.out.println(bFact);
    }
}
