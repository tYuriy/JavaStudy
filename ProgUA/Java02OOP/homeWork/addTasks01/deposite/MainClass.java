package ProgUA.Java02OOP.homeWork.addTasks01.deposite;

public class MainClass {
    public static void main(String[] args) {
        Depo depo1 = new Depo(12000,8,3);
        System.out.println(depo1.toString());
        System.out.println("Сумма после окончания срока депозита составит: " + String.format("%.2f",depo1.calcEndVal()));
    }
}
