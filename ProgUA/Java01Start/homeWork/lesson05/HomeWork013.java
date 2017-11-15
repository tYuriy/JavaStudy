package Java01Start.homeWork.lesson05;

public class HomeWork013 {
    public static void main(String[] args) {
        //создать одномерный массив и заполнить степенями числа
        int n = 15; //кол-во элементов массива
        int x=2; //число, степенями которого заполняется массив
        int nums[]= new int [n];
        //заполнение массива значениями и вывод на экран
        for (int i=0;i<nums.length;i++){
            nums[i]=(int)Math.pow(x,i);
            System.out.print(nums[i]+"\t\t");
        }
    }
}
