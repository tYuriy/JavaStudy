package Java01Start.classWork.lesson5;

public class Arrays {
    public static void main(String[] args) {
        //объявление массива 1 из 12 элементов
        int[] nums=new int[12];
        //объявление массива 2 из 12 элементов
        int nums2[]=new int[12];
        //объявление массива 3 из 12 элементов
        int[] nums3;
        nums3=new int[12];
        //объявление массива 4 из 12 элементов
        int nums4 [];
        nums4=new int[12];



        // Перебор элементов массива:
        for(int k=0;k<nums.length;k++){
            // Присваивание значения элементу массива:
            nums[k]=2*k+1;
            // Отображение значения элемента массива:
            System.out.print("| "+nums[k]+" ");
        }
            System.out.println("|");


    }
}
