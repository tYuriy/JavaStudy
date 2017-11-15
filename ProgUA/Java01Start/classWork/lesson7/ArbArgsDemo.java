package ProgUA.Java01Start.classWork.lesson7;

public class ArbArgsDemo {
    // Метод для вычисления суммы чисел:
    static int sum(int...a){
        int res=0;
        for(int k=0;k<a.length;k++){
            res+=a[k];
        }
        return res;
    } // Метод для извлечения символов из текста:
    static String getText(String t,int... a){
        String res="";
        for(int k=0;k<a.length;k++){
            res+=t.charAt(a[k]);
        }
        return res;
    } // Метод отображает значения аргументов:
    static void show(int[] a,char... b){
        System.out.print("Чисел "+a.length+": ");
        for(int k=0;k<a.length-1;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println("и "+a[a.length-1]);
        System.out.print("Символов "+b.length+": ");
        for(int k=0;k<b.length-1;k++){
            System.out.print(b[k]+" ");
        }
        System.out.println("и "+b[b.length-1]);
    }
    // Главный метод:
    public static void main(String[] args){
// Примеры вызова методов.
// Вычисление суммы чисел:
        System.out.println("Сумма чисел: "+sum(1,6,9,2,4));
        System.out.println("Сумма чисел: "+sum(5,1,2));
// Формируется текст:
        System.out.println(getText("Раз два три",0,10,8,1));
        System.out.println(getText("Бревно",3,5,1,5,4));
// Отображаются аргументы:
        show(new int[]{1,3,5},'A','B','C','D','E');
        show(new int[]{1,3,5,7,9},'A','B','C','D');
    }
}
