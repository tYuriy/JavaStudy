package Other.Examples;

/**
 * Created by user on 10.03.2017.
 */
public class arrays {
    public static void main(String[] args) {
        int [][][] values = new int[1][2][4];
        values[0][0][0]=1;
        values[0][0][1]=11;
        values[0][0][2]=111;
        values[0][1][0]=2;
        values[0][1][1]=22;
        values[0][1][2]=222;
        values[0][0][3]=123;
        values[0][1][3]=321;

        int[][] values2 = {{1,2},{3,4}};

        int ii = values.length;
        int jj = values[0].length;
        int kk = values[0][0].length;

        System.out.println(ii + " " + jj +" "+ kk);

        for (int i = 0; i<values2.length;i++){
            for (int j = 0; j<values2[0].length;j++){
                System.out.println(values2[i][j]);
            }
        }
        System.out.println();

        for (int i =0; i<values.length;i++){
            for (int j=0; j< values[i].length;j++){
                for (int k = 0;k< values[i][j].length;k++){
                    System.out.println(values[i][j][k]);
                }
            }
        }
    }
}
