package Java01Start.classWork.lesson5;

public class InitializationArrayDemo {
    public static void main(String[] args){
        // Создание массивов:
        int[] nums={1,3,7,2,8,5,9};
        char[] symbs={'A','Z','Q','R'};
        String[] txts={"красный","желтый","зеленый"};

        // Отображение содержимого массивов:
        System.out.println("Массив nums:");

        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }
        System.out.println("\nМассив symbs:");

        for(int k=0;k<symbs.length;k++){
            System.out.print(symbs[k]+" ");
        }

        System.out.println("\nМассив txts:");

        for(int k=0;k<txts.length;k++){
            System.out.print(txts[k]+" ");
        }

        System.out.println("");
    }
}
