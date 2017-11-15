package ProgUA.Java01Start.homeWork.lesson08;

/*
Напишите программу с методом для подсчета количества вхождений символа в текстовую строку
 */
public class SymbInStringCounter {
    public static void main(String[] args) {
        String str = "sdfasdf";
        char a = 'f';
        String str2 = "It is a good day to die!";
        char b = 'i';
        System.out.println(countSymbols(str,a));
        System.out.println(countSymbols(str2.toLowerCase(),b));
    }
    static int countSymbols (String str, char x){
        int a=0;
        char[] cArr = str.toCharArray();
        for (int i=0;i<cArr.length;i++){
            if (cArr[i]==x){a++;}
        }
        return a;
    }
}
