package com.daily.Jan.jan26;


//Cognizant interview: How to write singleton class using java
public class SingleTon {

    //private constructor
    //getIntace method which return singleTon object
    //containce any Collection object then return copy
    private static SingleTon singleTon;

    private SingleTon() {

    }

    public static SingleTon getIntanceSingleTone() {
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon();
                }
            }

        }
        return singleTon;
    }
}
