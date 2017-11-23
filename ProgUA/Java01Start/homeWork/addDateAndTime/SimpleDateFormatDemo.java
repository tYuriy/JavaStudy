package ProgUA.Java01Start.homeWork.addDateAndTime;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date dt = new Date(System.currentTimeMillis());
        System.out.println(dt);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss:sss");
        String res = sdf.format(dt);
        System.out.println(res);

        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
        res = sdf.format(dt);
        System.out.println(res);


        sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        res = sdf.format(dt);
        System.out.println(res);

        sdf = new SimpleDateFormat("dd/MM/yyyy DDD");
        res = sdf.format(dt);
        System.out.println(res);

    }
}
