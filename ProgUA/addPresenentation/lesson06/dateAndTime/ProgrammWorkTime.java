package ProgUA.addPresenentation.lesson06.dateAndTime;

public class ProgrammWorkTime {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i=0; i<Integer.MAX_VALUE;i++){
            if (i%10000000==0){
                System.out.println(i);
            }
        }
        long res = System.currentTimeMillis()-start;
        System.out.println("Result = " + res);
    }
}
