package ProgUA.Java02OOP.homeWork.addTasks01.deposite;

public class Depo {
    private double startAmount;
    private double rate;
    private int term;//years

    Depo (double startAmount, double rate, int term){
        this.startAmount= startAmount;
        this.rate=rate;
        this.term= term;
    }
    public double calcEndVal () {
        return startAmount*Math.pow((1+rate/100), term);
    }
    @Override
    public String toString() {
        return "Размер депозита = " + startAmount + " у.е., ставка = " + rate +"%, срок = " + term + " лет";
    }

    public double getRate() {
        return rate;
    }

    public double getStartAmount() {
        return startAmount;
    }

    public int getTerm() {
        return term;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
