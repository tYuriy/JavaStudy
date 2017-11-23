package ProgUA.Java01Start.homeWork.addTask.slide109;
/*Написать функцию, которая принимает массив чисел в качестве
аргумента, увеличивает его первые 3 элемента на 1 и
возвращает их сумму как результат. После изменения массив и
сумму надо вывести на экран.*/
public class FirstThreeMultiple {
    public static void main(String[] args) {
        int [] nums = {1,1,1,4};
        System.out.println(doCalcs(nums));
    }
    public static int doCalcs (int [] nums){
        int rez=0;
        for (int i=0;i<nums.length;i++){
            if (i<3){
                nums[i]+=1;
                rez += nums[i];
            }else{
                rez += nums[i];
            }
            System.out.println(nums[i]);
        }
        return rez;
    }
}
