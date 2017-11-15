package ProgUA.Java01Start.homeWork.addArrays;

/*
Напишите программу, в которой создается символьный массив из 10 элементов.
Массив заполнить большими (прописными) буквами английского алфавита.
Буквы берутся подряд, но только согласные (то есть гласные буквы 'A' ,'E' и 'I' при присваивании значений элементам массива нужно пропустить).
Отобразите содержимое созданного массива в консольном окне.
 */
public class EngLettersArray {
    public static void main(String[] args) {
        int arrSize = 10;
        char [] ch = new char[arrSize];
        char startChar ='A';
        char [] wrongChars = new char[]{'A','E','I'};

        for (int i=0; i<ch.length;i++){
            for (int j=0; j<wrongChars.length; j++){
                if (startChar==wrongChars[j]) startChar++;
            }
            ch[i]=startChar;
            startChar++;
        }

        for (int i=0; i<ch.length;i++){
            System.out.print(ch[i] + "\t");
        }
    }
}
