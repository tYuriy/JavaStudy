package ProgUA.Java01Start.classWork.lesson4;

public class forOperator {
    public static void main(String[] args) {

        int n=10,k,s=0;
        System.out.println();//сумма чисел от 0 до н

        for(k=1;k<=n;k++){
            if (k==3) continue; //если выполняется = этот цикл завершен и начинается следующий цикл
            s+=k;
        }

        System.out.println(s);


        }
}
