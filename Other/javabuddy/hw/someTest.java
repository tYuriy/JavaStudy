package Other.javabuddy.hw;

/**
 * Created by user on 31.01.2017.
 */
public class someTest {
    public static void main(String[] args) {
        //int i=+2, j =-2;
        //i=Integer.MIN_VALUE;


        //System.out.println(i);
        //System.out.println(Integer.compare(i,j));
        //System.out.println(Integer.compareUnsigned(i,j));

        String i="abcsxcvdwcxvxcdde",j;

        System.out.println(i);
        System.out.println(i.length());//длина строки
        System.out.println(i.concat("xxx"));//объединение
        j=i.concat("xxx");
        System.out.println(j.endsWith("x"));//проверка на значение в конце строки
        System.out.println(i.codePointAt(0));//код знака с указанным индексом
        System.out.println(i.replace("c","C")); // замена символа в строке
        System.out.println(i.substring(1));// обрезка строки начиная с указанного символа до конца

        char [] ch = i.toCharArray()  ; //преобразование строки в массив символов

        //i.toCharArray();
        for (char x:ch) {
            System.out.println(x); //вывод каждого символа в массиве
        }
    }
}
