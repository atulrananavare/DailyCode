package com.daily.JavaConcepts.wrapper;

public class BoxingUnboxing {

    //Primtive to Wrapper is called auto-boxing
    //Wrapper to Primitive is called auto-unboxing
    //JDK1.5 onwards auto concept is introduced.
    public static void main(String[] args) {

        //Boxing
        int i = 20;
        Integer I1 = new Integer(i);

        //Auto-Boxing
        Integer I2 = i;

        //Unboxing
        Integer I3 = new Integer(i);
        int i1 = I3.intValue();

        //Auto-Unboxing
        Integer I4 = new Integer(20);
        int i2 = I4;

    }
}
