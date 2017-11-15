package Java01Start.classWork.lesson5;

public class ReverseArrayDemo {
    public static void main(String[] args){
        // Создание массива:
        int[] nums={1,3,7,2,8,5,9};
        // Отображение содержимого массива:
        System.out.println("До инверсии:");

        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }

        System.out.println("\nПосле инверсии:");
        // Меняем порядок элементов в массиве:
        for(int k=0,s;k<nums.length/2;k++){
            s=nums[nums.length-1-k];
            nums[nums.length-1-k]=nums[k];
            nums[k]=s;
        }
        //Отображение содержимого массива:
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }
        System.out.println("");
    }
}
