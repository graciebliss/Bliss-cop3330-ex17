/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;

public class apps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender=in.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        int oz=in.nextInt();

        System.out.print("What is your weight, in pounds? ");
        int lbs=in.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int hr=in.nextInt();

        double bac=0.0;

        if(gender==1){
            double ratio=.73;
            bac=(double)(oz*5.14/lbs*ratio)-.015*hr;
        }
        else if(gender==2){
            double ratio=.66;
            bac=(double)(oz*5.14/lbs*ratio)-.015*hr;
        }

        String islegal="legal";

        if(bac>0.08){
            islegal="not legal";
        }
        System.out.print("Your BAC is "+bac+".\nIt is "+islegal+" for you to drive.");


    }
}
