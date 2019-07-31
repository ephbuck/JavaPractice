package com.buckstellar.javabmicalc;

public class BMICalc {
    //You need to change the run->edit configuration and change the "Mainclass" and working directory options.
    public static void main(String[]args){
        System.out.println("YourBMI:"+bmiCalc(30,60));
    }

    public static String bmiCalc(doubleweight,doublehieght){

        doubleansw=weight/hieght;
        Stringans;
        if(answ>1){
            ans="YouFat";
        }else if(answ<0.5){
            ans="You Skinny";
        }else{
            ans="You Might be Fat orSkinny";
        }
        returnans;
    }

/*
TO create ajava only:
create empty activity, pick java module
*/
}
}
