package Java01Start.homeWork.lesson07;

public class MaxFromSomeArgs {
    /*
    Программа с методом, который возвращает наибольшее из значений, переданных аргументами методу.
    Кол-во аргументов может быть произвольным.
    */
    public static void main(String[] args) {
        int a = getMax(3,4,6,333,1231,123,55+2400,44,2332,7);
        System.out.println("Максимальное число из переданных аргуметов = " + a);
    }
    static int getMax (int ... nums){
        int x = nums[0];
        for(int i=1; i<nums.length; i++){
            if (x < nums[i]){
                x=nums[i];
            }
        }
        return x;
    }
}
