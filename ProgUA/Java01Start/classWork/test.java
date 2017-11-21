package ProgUA.Java01Start.classWork;

import java.util.Scanner;
import java.util.Arrays;
import ProgUA.ArrClass;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] signArr = {'+','-','*','/'};
        int [] calcPos = new int [str.length()];
        char [] calcSign =  new char [str.length()];
        int k=0;
        for (int i=0; i<str.length(); i++){
            for (int j=0; j<signArr.length; j++){
                if (str.charAt(i)==signArr[j]){
//                    System.out.println(i + " " + j + " " + signArr[j]);
                    calcPos [k]= str.indexOf(str.charAt(i));
                    calcSign [k] = signArr[j];
                    k++;
                }
            }
        }
        calcPos = Arrays.copyOf(calcPos,k);
        calcSign = Arrays.copyOf(calcSign,k);

//        ArrClass.printArr(calcPos);
//        ArrClass.printArr(calcSign);

        int firstNum;
        int secNum = 0;
        int sPosFirstNum=0;
        int lPosFirstNum=calcPos[0];
        int sPosSecNum;
        int lPosSecNum;
//        String num = "";

        System.out.println();

        firstNum = Integer.parseInt(str.substring(sPosFirstNum,lPosFirstNum));

 //       System.out.println(firstNum);
 //       System.out.println(secNum);

        for (int i=0; i<calcPos.length; i++){
            //System.out.println(doCalc(firstNum,secNum,calcSign[i]));
//            System.out.println("firstNum = " + firstNum);
            sPosSecNum = calcPos[i]+1;
            if (i+1>calcPos.length-1){
                lPosSecNum = str.length();
            } else {lPosSecNum = calcPos[i+1];}

            secNum = Integer.parseInt(str.substring(sPosSecNum,lPosSecNum));
//            System.out.println("secNum = " +  secNum);
            firstNum = doCalc(firstNum,secNum,calcSign[i]);
        }
        System.out.println(firstNum);

    }
    public static int doCalc (int a, int b, char c){
        int d = 0;
        switch (c){
            case '+': d=a+b;
            break;
            case '-': d=a-b;
                break;
            case '*': d=a*b;
                break;
            case '/': d=a/b;
                break;
        }
        return d;
    }
}
