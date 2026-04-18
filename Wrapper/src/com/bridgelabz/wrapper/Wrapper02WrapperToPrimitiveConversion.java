package com.bridgelabz.wrapper;

public class Wrapper02WrapperToPrimitiveConversion {
    public static void main(String[] args) {
        Double wrapperDouble = Double.valueOf(45.67);
        double primitiveDouble = wrapperDouble.doubleValue();
        int primitiveInt = wrapperDouble.intValue();

        System.out.println("Double object: " + wrapperDouble);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive int: " + primitiveInt);
    }
}
