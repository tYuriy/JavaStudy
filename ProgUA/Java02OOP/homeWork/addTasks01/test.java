package ProgUA.Java02OOP.homeWork.addTasks01;

public class test {
    public static void main(String[] args) {
//        char s = 'A';
//        System.out.println((int)s);
        int k = 0;

        for (int i = 1; i < 600; i++) {
            if (Math.pow(2,k)%i==0){
                k++;
                System.out.println(k+" " +i);
            }
        }
    }
}
