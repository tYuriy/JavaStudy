package ProgUA.Java02OOP.homeWork.addTasks01.ringOfObjects;

public class MainClass {
    public static void main(String[] args) {
        int objCount=5;

        RingPart rp1 = new RingPart();
        RingPart rp2 = rp1;

        for (int i=0; i<objCount; i++){

            rp1.rp = new RingPart();
            System.out.println(rp1);

            rp1 =rp1.rp;
        }
        rp1=rp2.rp;


        for (int i = 0; i < objCount; i++) {
            System.out.println(rp1.toString());//+ " " + rp1.rp.toString());
        }


    }
}
