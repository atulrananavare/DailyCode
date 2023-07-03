package com.daily.Feb.feb7;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Fruit Name:: ");
        String fruit=scan.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "apple":
                System.out.println("Red of fruit");
                break;
            case "banana":
                System.out.println("All time fruit");
                break;
            default:
                System.out.println("normal other fruit");
        }


    }
}
