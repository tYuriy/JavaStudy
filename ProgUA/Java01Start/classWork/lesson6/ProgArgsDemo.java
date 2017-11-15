package ProgUA.Java01Start.classWork.lesson6;

public class ProgArgsDemo {
    public static void main(String[] args){
        // Определние количества переданных параметров:
        System.out.println("При вызове в программу передано "+args.length+" параметров:");
        // Отображение значений параметров:
        for(int k=0;k<args.length;k++){
            System.out.println((k+1)+"-й параметр: "+args[k]);
        }
    }
}
