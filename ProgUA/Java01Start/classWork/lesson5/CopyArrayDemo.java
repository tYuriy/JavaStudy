package Java01Start.classWork.lesson5;

public class CopyArrayDemo {
    public static void main(String[] args){
        // Массив:
        int[] a={1,3,5,7,9};
        // Переменные массивов:
        int[] b,c;
        // Присваивание массивов:
        b=a;
        c=new int[a.length];
        for(int k=0;k<a.length;k++){
            c[k]=a[k];
        }
        a[0]=0;
        b[b.length-1]=0;
        System.out.println("a:\t b:\t c:");
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]+"\t "+b[k]+"\t "+c[k]);
        }
    }
}
