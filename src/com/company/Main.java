package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int yearofBirthday;
        int monthofBirthday;
        int dayofBirthday;
        yearofBirthday=1989;
        monthofBirthday=8;
        dayofBirthday=16;
        int sum;
        sum=yearofBirthday+monthofBirthday+dayofBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения:"+sum);

        boolean mothBiggerDay=(monthofBirthday>dayofBirthday);
        System.out.println("Месяц моего рождения больше даты рождения:"+mothBiggerDay);

        char[]charArrays=new char[]{'С','Е','Р','Г','Е','Й'};
        String newString1=new String(charArrays);
        System.out.println("Мое имя в массиве:"+newString1);

        double myAge;
        myAge=31;
        double pathYear;
                pathYear= (double)5/12;
        System.out.printf("Мне:");
        DecimalFormat  format=new DecimalFormat("#.00");
        System.out.print(format.format(pathYear+myAge));
        System.out.println("года");


        ;



    }
}
