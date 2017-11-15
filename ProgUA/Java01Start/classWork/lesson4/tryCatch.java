package ProgUA.Java01Start.classWork.lesson4;

public class tryCatch {
    public static void main(String[] args) {

        try{
            int a=1/0;
        }catch (Exception ex){
            System.out.println("error");
            System.out.println(ex);
        }
    }
}
