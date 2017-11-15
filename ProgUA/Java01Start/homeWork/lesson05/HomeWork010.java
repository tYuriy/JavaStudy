package Java01Start.homeWork.lesson05;

public class HomeWork010 {
    public static void main(String[] args) {
        //реализовать сдвиг массива на одну позицию
        int a= 10;
        int [] nums = new int[a];

        //заполняем массив числами и выводим в консоль
        for (int i=0; i<nums.length;i++){
            nums[i] = i;
            System.out.print(nums[i] + "\t");
        }

        System.out.println("\n");

        //реализуем сдвиг массива
        int val;
        int endIndex = nums.length-1;
        val = nums[endIndex];

        for (int i=endIndex; i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0]= val;

        for (int i : nums) {
            System.out.print(i + "\t");
        }
    }
}
