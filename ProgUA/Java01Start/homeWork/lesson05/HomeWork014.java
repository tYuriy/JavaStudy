package Java01Start.homeWork.lesson05;

public class HomeWork014 {
    public static void main(String[] args) {
        //создать одномерный массив и заполнить числами Фибоначчи
        int n = 15; //кол-во элементов массива
        //int x=2; //число, степенями которого заполняется массив
        int nums[]= new int [n];
        int valOne =1;
        int valTwo=0;
        int valAct=0;

        //заполнение массива значениями и вывод на экран
        for (int i=0;i<nums.length;i++){
            valAct=valOne+valTwo;
            nums[i]=valAct;
            valOne=valTwo;
            valTwo=valAct;
            System.out.print(nums[i]+"\t\t");
        }
    }
}
