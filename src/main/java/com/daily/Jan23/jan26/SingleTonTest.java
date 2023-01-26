package com.daily.Jan23.jan26;

public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon obj1=SingleTon.getIntanceSingleTone();
        SingleTon obj2=SingleTon.getIntanceSingleTone();

        if(obj1==obj2){
            System.out.println("This is perfect Singleton");
        }else{
            System.out.println("Something problem in singleton");
        }
    }
}
