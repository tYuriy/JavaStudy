package Java01Start.homeWork.addArrays;

//import java.util.Arrays.*;

/*
Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
Массив заполняется буквами "через одну", начиная с буквы 'a':
то есть массив заполняется буквами 'a', 'c', 'e', 'g', и так далее.
Отобразите массив в консольном окне в прямом и обратном порядке.
Размер массива задается переменной.
*/
public class EngSmallLettersArray {
    public static void main(String[] args) {
        int arrSize = 9;
        char [] ch = new char[arrSize];
        char startChar ='a';

        for (int i=0; i<ch.length;i++){
            ch[i]=startChar;
            startChar+=2;
        }
        //Array print
        for (int i=0; i<ch.length;i++){
            System.out.print(ch[i] + "\t");
        }
        System.out.println();
        //reverse array print
        for (int i=0; i<ch.length;i++){
            System.out.print(ch[ch.length-i-1] + "\t");
        }
    }
}
