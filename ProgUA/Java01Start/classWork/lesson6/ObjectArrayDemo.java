package Java01Start.classWork.lesson6;

public class ObjectArrayDemo {
    public static void main(String[] args){
        // Массив объектов класса Object:
        Object[] objs=new Object[3];
        // Значения разных типов:
        objs[0]=123;
        objs[1]='A';
        objs[2]="Java";
        // Отображение содержимого:
        for(int k=0;k<objs.length;k++){
            System.out.println(objs[k]);
        }
        System.out.println();
        // Новые значения элементов:
        objs[0]=(int)objs[0]+1;
        objs[1]="Hello";
        objs[2]=32.1;
        // Отображение содержимого:
        for(int k=0;k<objs.length;k++){
            System.out.println(objs[k]);
        }
    }
}
