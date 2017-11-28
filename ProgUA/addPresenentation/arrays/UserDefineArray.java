package ProgUA.addPresenentation.arrays;
import javax.swing.*;

import java.util.Random;

import static javax.swing.JOptionPane.*;
/*
Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
элементами, а затем выводить нужный элемент по его индексу на консоль.
 */
public class UserDefineArray {
    public static void main(String[] args) {

        int size = (inputVal("Введите кол-во элементов массива", "Ввод данных"));
        int [] arr = new int[size];
        fillArray(arr,size,100);
        printArr(arr);
        int num = (inputVal("Введите индекс элемента массива, который необходимо показать", "Ввод данных"));
        showMessageDialog(null,arr[num],"Отображение выбранного элемента",QUESTION_MESSAGE, new ImageIcon("src/ProgUA/pics/sm.png"));
    }
    static int inputVal (String txt, String title){
        int val=0;
        String str = showInputDialog (null, txt,title,ERROR_MESSAGE, new ImageIcon("src/ProgUA/pics/cg.png"), null,null).toString();
        val = Integer.parseInt(str);
        return val;
    }
    static int [] fillArray (int[] arr, int size, int maxVal){
        Random rnd = new Random();
        for (int i=0; i<size; i++){
            arr[i]=rnd.nextInt(maxVal);
        }
        return arr;
    }
    static void printArr (int [] arr){
        for (int s: arr){
            System.out.print(s + "\t");
        }
        System.out.println();
    }

}
