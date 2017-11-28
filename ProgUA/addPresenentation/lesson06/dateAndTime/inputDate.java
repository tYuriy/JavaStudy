package ProgUA.addPresenentation.lesson06.dateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class inputDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Enter the date: ");
        String dtStr = sc.nextLine();

        try {
            Date dt = sdf.parse(dtStr);
            System.out.println(dt);
        } catch (ParseException e){
            System.out.println("Wrong date!");
        }
        sc.close();
    }
}
