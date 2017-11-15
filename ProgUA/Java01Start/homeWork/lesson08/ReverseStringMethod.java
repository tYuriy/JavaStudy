package Java01Start.homeWork.lesson08;


/*
Напишите программу с методом для отображения тектовой строки в обратном порядке
 */
public class ReverseStringMethod {
    static char[] reverseString (char[] x){
        char [] y = x;
        char symb;
        for (int i=0; i<x.length/2; i++){
            symb=y[x.length-i-1];
            y[x.length-i-1] = x[i];
            x[i] = symb;
        }
        return y;
    }
    public static void main(String[] args) {
        String str = "а роза упала на лапу азора";
        //reverseString(str.toCharArray());
        System.out.println(reverseString(str.toCharArray()));

    }
}
